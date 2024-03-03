package datastructures.queue;

/*
Queue is basically like when you get in line.
FIFO = First In, First Out
Rule: you have to enqueue and dequeue on OPPOSITE ends.
 implementing queue: 1- array list => enqueue and dequeue at the end has O(1) but at the
                                      beginning both are O(n).
                     2- linked list => dequeue at the beginning O(1), enqueue at the
                                       end is O(1)

 */
public class Queue {
    private Node first;
    private Node last;
    private int lenght;

    class Node{
        int value;
        Node next;

        public Node(int value){
            this.value = value;
        }
    }

    public Queue(int value){
        Node newNode = new Node(value);
        first = newNode;
        last = newNode;
        lenght = 1;
    }

    //You can run these print methods to have visibility into your queue for troubleshooting purposes.
    public void printQueue(){
        Node temp = first;
        while(temp != null){
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void getFirst(){
        System.out.println("First: " + first.value);
    }

    public void getLast(){
        System.out.println("Last: " + last.value);
    }

    public void getLength(){
        System.out.println("Length: " + lenght);
    }

    //Adding a node to the END of the linked list.
    public void enqueue(int value){
        Node newNode = new Node(value);
        if(lenght == 0) {
            first = newNode;
            last = newNode;
        } else { //if we have items in the queue
            last.next = newNode;
            last = newNode;
        }
        lenght++;
    }
}
