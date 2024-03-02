package datastructures.stack;

public class Main {
    public static void main(String[] args) {
        Stack myStack = new Stack(4);

        myStack.printStack();
        myStack.getTop();
        myStack.getHeight();

        System.out.println("Push method~~~~~~~~~~~~~~");
        myStack.push(6);
        myStack.push(10);
        myStack.printStack();

        System.out.println("Pop method~~~~~~~~~~~~~~");
        System.out.println(myStack.pop().value);
        System.out.println(myStack.pop().value);
        System.out.println(myStack.pop().value);
        System.out.println(myStack.pop());

    }
}
