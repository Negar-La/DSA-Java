package datastructures.queue;

public class Main {
    public static void main(String[] args) {
        Queue myQueue = new Queue(5);

        myQueue.getFirst();
        myQueue.getLast();
        myQueue.getLength();
        myQueue.printQueue();

        System.out.println("Enqueue method------------------");
        myQueue.enqueue(4);
        myQueue.enqueue(22);
        myQueue.printQueue();

    }
}
