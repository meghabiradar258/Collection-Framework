package PraticePrograms.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

//8. Write a Java program to sort a given array list.
public class SortList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Cherry");
        list.add("blue");
        list.add("Banana");
        list.add("white");
        list.add("Apple");


        Collections.sort(list);

        System.out.println(list);
    }

}
