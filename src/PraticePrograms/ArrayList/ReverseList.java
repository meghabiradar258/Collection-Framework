package PraticePrograms.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

//11. Write a Java program to reverse elements in an array list.
public class ReverseList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Cherry");
        list.add("blue");
        list.add("Banana");
        list.add("white");
        list.add("Apple");
        System.out.println(" original list " + list);
        Collections.reverse(list);
        System.out.println(" reverse list " + list);
    }
}
