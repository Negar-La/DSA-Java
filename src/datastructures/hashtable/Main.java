package datastructures.hashtable;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        HashTable myTable = new HashTable();
        myTable.printTable();

        System.out.println("set method**********************");

        myTable.set("milk", 8);
        myTable.set("bread", 3);
        myTable.set("potato", 7);
        myTable.set("apple", 4);
        myTable.printTable();

        System.out.println("get method**********************");
        System.out.println(myTable.get("apple"));
        System.out.println(myTable.get("banana"));

        System.out.println("keys method**********************");

        System.out.println(myTable.keys());

    }
}
