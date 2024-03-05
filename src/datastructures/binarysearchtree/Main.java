package datastructures.binarysearchtree;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree myBST = new BinarySearchTree();
        System.out.println("Root = " + myBST.root);

        System.out.println("insert method =============");
        myBST.insert(47);
        myBST.insert(76);
        myBST.insert(21);
        myBST.insert(52);
        myBST.insert(18);
        myBST.insert(82);

        myBST.insert(27);
        System.out.println(myBST.root.left.right.value); //to get to number 27, starting from root, we go to the left and then right

        System.out.println("contains method =============");

        System.out.println(myBST.contains(27));
        System.out.println(myBST.contains(17));
    }
}
