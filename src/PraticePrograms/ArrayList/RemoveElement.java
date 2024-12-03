package PraticePrograms.ArrayList;

import java.util.ArrayList;

//6. Write a Java program to remove the third element from an array list.
public class RemoveElement {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Date");

        // Remove the third element
        list.remove(2);

        System.out.println(list);
    }
}


