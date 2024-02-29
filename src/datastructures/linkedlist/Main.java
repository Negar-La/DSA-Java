package datastructures.linkedlist;

public class Main {
    public static void main(String[] args) {
        LinkedList myLinkedList = new LinkedList(4);

        myLinkedList.getHead();
        myLinkedList.getTail();
        myLinkedList.getLength();
        myLinkedList.printList();

        System.out.println("Append a Node ==============");

        myLinkedList.append(5);

        myLinkedList.getHead();
        myLinkedList.getTail();
        myLinkedList.getLength();
        myLinkedList.printList();

        /*
        System.out.println("Remove Last Node 5 ==============");
        //we have 2 nodes in the list, it returns 5
        System.out.println(myLinkedList.removeLast().value);

        System.out.println("Remove Last Node 4 ==============");
        //we have 1 node in the list, it returns 4
        System.out.println(myLinkedList.removeLast().value);

        System.out.println("Remove Last Node null==============");
        //we have 0 node in the list, it returns null
        System.out.println(myLinkedList.removeLast());

         */

        System.out.println("Prepend a Node ==============");
        myLinkedList.prepend(1);
        myLinkedList.printList();

        /*
        System.out.println("Remove first Node ==============");
        System.out.println(myLinkedList.removeFirst().value); // 1

        System.out.println(myLinkedList.removeFirst().value); // 4

        System.out.println(myLinkedList.removeFirst().value); // 5

        System.out.println(myLinkedList.removeFirst()); // null

         */

        System.out.println("get method ==============");
        System.out.println("The node at index 0 is: "+ myLinkedList.get(0).value); //1
        System.out.println("The node at index 1 is: "+ myLinkedList.get(1).value); //4
        System.out.println(myLinkedList.get(6)); //null

        System.out.println("set method ==============");
        myLinkedList.set(1, 3);
        myLinkedList.set(8, 88);
        myLinkedList.printList();

        System.out.println("insert method ==============");
        myLinkedList.insert(1,2);
        myLinkedList.printList();

        System.out.println("remove method ==============");
        myLinkedList.remove(3);
        myLinkedList.printList();

        System.out.println("reverse method ==============");
        myLinkedList.reverse();
        myLinkedList.printList();
    }
}
