package datastructures.linkedlist;

//Each node has to have a pointer pointing to it or it's garbage collected.
//That's why we need 'head' pointing to the first node, otherwise it will get garbage collected
public class LinkedList {
    //three class variables
    private Node head;
    private Node tail;
    private int length;

    //Inner class = nested class
    class Node{
        //two class variables
        int value;
        Node next;
        //constructor
        Node(int value){
            this.value = value;
        }
    }

    public LinkedList(int value){
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    //important to have a way to look at what you have to troubleshoot your code.
    public void printList(){
        Node temp = head;
        while (temp!= null){
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void getHead(){
        System.out.println("Head: "+ head.value);
    }

    public void getTail(){
        System.out.println("Tail: "+ tail.value);
    }

    public void getLength(){
        System.out.println("Length: "+ length);
    }

    public void append(int value){
        Node newNode = new Node(value);
        if(length ==0){
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        length++;
    }

    //removeLast returns a Node Because an end user will probably want to be able to access the contents of the node being removed.
    public Node removeLast(){
        Node temp = head;
        Node prev = head;
        //Edge case
        if(length == 0) return null;
        //Edge case
        if (length == 1){
            head = null;
            tail = null;
        }

        while(temp.next != null){
            //The order is important here!
            prev = temp;
            temp = temp.next;
        }
        tail = prev;
        tail.next = null;

        length--;
        return temp;
    }

    //Return type is void because we just add a node in the beginning of the linkedlist and not return anything.
    public void prepend(int value){
        Node newNode = new Node(value);
        //Edge case
        if (length == 0){
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        length++;
    }

    public Node removeFirst(){
        Node temp = head;
        if (length == 0) return null;
        if (length == 1) {
            head = null;
            tail = null;
        } else {
            head = head.next;
            temp.next = null;
        }
        length--;
        return temp;
    }

    public Node get(int index){
        //Edge case to make sure index is in range!
        if (index < 0 || index >= length) return null;
        Node temp = head;
        for(int i = 0; i < index; i++) {
            //we move temp to the index that we want to return.
            temp = temp.next;
        }
        return temp;
    }

    public boolean set(int index, int value){
        if (index < 0 || index >= length) return false;
        Node temp = get(index);
        temp.value = value;
        return true;
    }

    public boolean insert(int index, int value){
        if (index < 0 || index > length) return false;
        if(index == 0){
            prepend(value);
            return true;
        }
        if (index == length) {
            append(value);
            return true;
        }
        Node newNode = new Node(value);
        Node temp = get(index-1); //we need a variable to point to the node before the index where we want to insert it.
        newNode.next = temp.next;
        temp.next = newNode;
        length++;
        return true;
    }

    public Node remove(int index){
        if (index < 0 || index >= length) return null;
        if(index == 0){
           return removeFirst();
        }
        if (index == length-1) {
            return removeLast();
        }
        Node prev = get(index-1);
        //we don't use temp = get(index) because it is O(n)
        Node temp = prev.next; //O(1)
        prev.next = temp.next;
        temp.next = null;
        length--;
        return temp;
    }

    public void reverse(){
        //reversing in place
        Node temp = head;
        head = tail;
        tail = temp;
        Node after = temp.next;
        Node before = null;

        for(int i = 0; i < length; i++){
            after = temp.next;
            temp.next = before;
            before = temp;
            temp = after;
        }
    }


}

