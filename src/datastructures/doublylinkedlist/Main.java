package datastructures.doublylinkedlist;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList myDLL = new DoublyLinkedList(2);
        myDLL.printList();
        myDLL.getHead();
        myDLL.getTail();
        myDLL.getLength();

        System.out.println("Append a Node ==============");

        myDLL.append(3);
        myDLL.append(4);
        myDLL.printList();

        /*
        System.out.println("remove last Node ==============");
        System.out.println(myDLL.removeLast().value);
        System.out.println(myDLL.removeLast().value);
        System.out.println(myDLL.removeLast().value);
        System.out.println(myDLL.removeLast());

         */

        System.out.println("Prepend method ==============");
        myDLL.prepend(0);
        myDLL.printList();

        /*
        System.out.println("Remove first node ==============");
        System.out.println(myDLL.removeFirst().value);
        System.out.println(myDLL.removeFirst().value);
        System.out.println(myDLL.removeFirst().value);
        System.out.println(myDLL.removeFirst().value);
        System.out.println(myDLL.removeLast());

         */

        System.out.println("get method ==============");

        System.out.println(myDLL.get(0).value);
        System.out.println(myDLL.get(1).value);
        System.out.println(myDLL.get(10));

        System.out.println("set method ==============");
        myDLL.set(0, 1);
        myDLL.printList();

        System.out.println("insert method ==============");
        myDLL.insert(1, 10);
        myDLL.printList();

        System.out.println("remove method ==============");
        myDLL.remove(4);
        myDLL.printList();



    }
}
