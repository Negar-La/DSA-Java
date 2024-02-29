package datastructures.linkedlist;


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
}

