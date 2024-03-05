package datastructures.binarysearchtree;

/*
- A linked list is a tree that does not fork.
- Instead of pointing to next, it points to 2 nodes (left & right) = that makes it a BINARY tree.
- Some terminology: Full tree = every node either points to 0 or 2 nodes.
                    Perfect tree = any level in the tree that has any nodes is completely filled all the way across.
                    Complete tree = you fill the tree from left to right with no gap.
- Every node can only have one parent.
- A node that does not have children is called a leaf.
- A binary SEARCH tree is a binary tree in a particular way: the numbers greater than parent go to the right of the node
    and less than go to the left of that node. -- we always start at the top --
-if you take any node in a binary search tree, all nodes below it to the right are greater than that node and
                                               all nodes below it to the left are less than that node.

- Big O in BST: lookup() => O(log n) = divide & conquer = very efficient
         remove() => O(log n)
         insert() => O(log n)

- Big O in linked list: lookup() => O(n)
                        remove() => O(n)
                        insert()to the end => O(1)   FASTER WITH LINKED LIST
 */
public class BinarySearchTree {
    //Each node has to have a pointer pointing to it or it's garbage collected.
    Node root; //To have access to root in main method, it's not private.

    class Node{
        int value;
        Node left;
        Node right;

        public Node(int value){
            this.value = value;
        }
    }

    /*

    //constructor that creates the first node at the time that new instance is created
    public BinarySearchTree(int value){
        Node newNode = new Node(value);
        root = newNode;
    }

    //initializing a tree that does not have any node in it. but since root is already null, we don't need this constructor
    public BinarySearchTree(){
        root = null; //redundant
    }

     */

    // binary search tree can't have DUPLICATES!
    public boolean insert(int value){
        Node newNode = new Node(value);
        if(root == null){
            root = newNode;
            return true; // we don't want to run any more code = we need a return statement
        }
        Node temp = root;
        while(true){
            if (newNode.value == temp.value)  return false;
            if(newNode.value < temp.value){
                if(temp.left == null) { //the spot is open
                    temp.left = newNode;
                    return true;
                }
                temp = temp.left;

            } else {
                if(temp.right == null) { //the spot is open
                    temp.right = newNode;
                    return true;
                }
                temp = temp.right;
            }
        }
    }



}
