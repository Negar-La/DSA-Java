package datastructures.stack;
/*
 stack is like a can of tennis balls
 LIFO = Last In, First Out
 Rule: you have to push and pop from the SAME end.
 Example: the back button in the web browser
 Implementing stack: 1- array list => add & remove at the end has O(1)
                     2- linked list => add & remove at the beginning O(1)

 linked list method (prepend) => stack (push)
 Linked list method (removeFirst) => stack (pop)
 */


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
