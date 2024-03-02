package datastructures.stack;

public class Stack {
    private Node top; //we only add & remove items from the top because both are O(1) and we don't need the bottom.
    private int height; //we represent stack vertically


    class Node{
        int value;
        Node next;

        public Node(int value){
            this.value = value;
        }
    }

    public Stack(int value){
        Node newNode = new Node(value);
        top = newNode;
        height = 1;
    }

    public void printStack(){
        Node temp = top;
        while(temp != null){
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void getTop(){
        System.out.println("Top: "+ top.value);
    }

    public void getHeight(){
        System.out.println("Height: "+ height);
    }

    //push method is very similar to prepend method in linked list.
    public void push(int value){
        Node newNode = new Node(value);
        if(height == 0) {
            top = newNode;
        } else {
            newNode.next = top;
            top = newNode;
        }
        height++;
    }

    public Node pop(){
        if(height == 0) return null;
        Node temp = top;
        top = top.next;
        temp.next = null;

        height--;
        return temp;
    }
}
