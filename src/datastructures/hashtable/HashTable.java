package datastructures.hashtable;

import java.util.ArrayList;

/*
- We store key/value pairs in an array.
- hash method: we run the hash on the key. every letter has an Ascii text numerical value.
- the hash method gives us an address = an index in the array, where we store key/value pair.
- hash method is one way - deterministic (every time you run a key, it gives you the same index).
- Collision: more than 1 key/value pair at the same index
- Deal with Collision: 1-Separate Chaining = put next key/value pair at the same address
                       2-Linear Probing = go to the next open spot and put the key/value pair there
- Separate Chaining: we have linked lists in each address
- we have fewer collisions if the array has a prime number of index

-Big O: hash method: O(1) = same number of operations
        set method: O(1)
        get method: O(1) = Key lookup is O(1) but not value
 */
public class HashTable {
    private int size = 7; //the size of the array that we use for our address space.
    private Node[] dataMap; //an array of pointers to nodes

    class Node {
        private String key;
        private int value;
        private Node next;

        public Node(String key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    public HashTable() {
        dataMap = new Node[size];
    }

    //The method to see what is in the hash table
    public void printTable() {
        for (int i = 0; i < dataMap.length; i++) {
            System.out.println(i + ":");
            Node temp = dataMap[i];
            while (temp != null) {
                System.out.println("  {" + temp.key + " = " + temp.value + "}");
                temp = temp.next;
            }
        }
    }

    //private method because it is only used by other methods in this class
    private int hash(String key) {
        int hash = 0;
        char[] keyChars = key.toCharArray(); //put the string ito an array of characters example: [h, e, l, l, o]
        for (int i = 0; i < keyChars.length; i++) {
            //inside the loop we create our calculation
            int asciiValue = keyChars[i]; //we set an int variable equal to a char
            hash = (hash + asciiValue * 23) % dataMap.length; //23 is a prime number and multiplyig by 23 gives us a more random number.
            //% dataMap.length = % 7 = anything you divide by 7 has a remainder between 0 and 6 = range 0-6 = address 0-6
        }
        return hash; //hash will always be a number in the range of 0-6
    }

    public void set(String key, int value) {
        int index = hash(key); //gives us the index the node will eventually go.
        Node newNode = new Node(key, value);
        if (dataMap[index] == null) { //an empty linked list
            dataMap[index] = newNode;
        } else {
            Node temp = dataMap[index]; //it is the pointer that points to the first node.
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public int get (String key){
        int index = hash(key);
        Node temp = dataMap[index];
        while(temp != null) {
            if (temp.key == key) return temp.value;
            temp = temp.next;
        }
        return 0;
    }

    //this method returns an arrayList of keys
    public ArrayList keys(){
        ArrayList<String> allKeys = new ArrayList<>();
        for(int i = 0; i < dataMap.length; i++){
            Node temp = dataMap[i];
            while(temp != null){
                allKeys.add(temp.key);
                temp = temp.next;
            }
        }
        return allKeys;
    }

}



