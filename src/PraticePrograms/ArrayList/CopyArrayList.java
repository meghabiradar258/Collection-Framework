package PraticePrograms.ArrayList;

import java.util.ArrayList;
//9. Write a Java program to copy one array list into another.
public class CopyArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Cherry");
        list.add("blue");
        list.add("Banana");
        list.add("white");
        list.add("Apple");
ArrayList<String> list1= new ArrayList<>(list);
list1.add("black");
        System.out.println(list);
        System.out.println(list1);
    }


    }
