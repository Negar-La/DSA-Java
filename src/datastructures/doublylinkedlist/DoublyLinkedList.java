package datastructures.doublylinkedlist;

public class DoublyLinkedList {
    private Node head;
    private Node tail;
    private int length;

    class Node{
        int value;
        Node next;
        Node prev;

        public Node(int value){
            this.value = value;
        }
    }

    public DoublyLinkedList(int value){
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public void printList(){
        Node temp = head;
        while(temp != null){
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void getHead(){
        System.out.println("Head: " + head.value);
    }

    public void getTail(){
        System.out.println("Tail: " + tail.value);
    }

    public void getLength(){
        System.out.println("Length: " + length);
    }

    public void append(int value){
        Node newNode = new Node(value);
        if (length ==0){
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        length++;
    }

    public Node removeLast(){
        if(length == 0) return null;
        Node temp = tail; //since we are returning that last Node, we need a variable to point to it.
        if(length == 1){
            head = null;
            tail = null;
        } else { // without 'else' all subsequent statements will be executed unconditionally, will lead to a potential NullPointerException!
            tail = tail.prev;
            tail.next = null;
            temp.prev = null;
        }
        length--;
        return temp;
    }

    public void prepend(int value){
        Node newNode = new Node(value);
        if(length == 0){
            head = newNode;
            tail = newNode;
        } else {
            head.prev = newNode;
            newNode.next = head;
            head = newNode;
        }
        length++;
    }

    public Node removeFirst(){
        if(length == 0) return null;
        Node temp = head;
        if(length == 1){
            head = null;
            tail = null;
        } else{
            head = head.next;
            head.prev = null;
            temp.next = null;
        }
        length--;
        return temp;
    }

    //get method for doubly linkedlist is the same as singly linkedlist, but we can write it more efficient.
    /*
    public Node get(int index){
        if(index < 0 || index >= length) return null;
        Node temp = head;
        for(int i = 0; i < index; i++){
            temp = temp.next;
        }
        return temp;
    }

     */

    public Node get(int index) {
        if (index < 0 || index >= length) return null;
        Node temp = head;
        if (index < length / 2) { //node we're looking for is in the first half of the linked list.
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
        } else { //node we're looking for is in the second half of the linked list.
            temp = tail;
            for(int i = length-1; i > index; i--){
                temp = temp.prev;

            }
        }
        return temp;
    }

    public boolean set (int index, int value){
        if (index < 0 || index >= length) return false;
        Node temp = get(index);
        temp.value = value;
        return true;
    }

    public boolean insert(int index, int value){
        if (index < 0 || index > length) return false;
        if (index == 0) {
            prepend(value);
            return true;
        }
        if (index == length){
            append(value);
            return true;
        }
        Node newNode = new Node(value);
        Node before = get(index-1);
        Node after = before.next;

        after.prev = newNode;
        newNode.prev = before;
        before.next = newNode;
        newNode.next = after;
        length++;


        return true;
    }

    public Node remove(int index) {
        if (index < 0 || index >= length) return null;
        if (index == 0) return removeFirst();
        if (index == length-1) return removeLast();

        Node temp = get(index); //since we are returning this Node, we need a variable to point to it.

        /*
        // do this with just 1 variable!
        temp.next.prev = temp.prev;
        temp.prev.next = temp.next;
        temp.next = null;
        temp.prev = null;

         */
        Node before = temp.prev;
        Node after = temp.next;

        before.next = temp.next;
        after.prev = temp.prev;
        temp.next = null;
        temp.prev = null;

        length--;
        return temp;
    }

}
