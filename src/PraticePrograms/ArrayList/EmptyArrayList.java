package PraticePrograms.ArrayList;

import java.util.ArrayList;

//17. Write a Java program to empty an array list.
public class EmptyArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Date");
        System.out.println(list);
    list.clear();
        System.out.println(list);
    }

    }
