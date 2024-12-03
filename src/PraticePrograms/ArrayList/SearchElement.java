package PraticePrograms.ArrayList;

import java.util.ArrayList;
//7. Write a Java program to search for an element in an array list.
public class SearchElement {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("white");
        list.add("yellow");
        list.add("blue");
        list.add("black");


        String a = "blue";
        if (list.contains(a)) {
            System.out.println(a + " is found in the list.");
        } else {
            System.out.println(a + " is not found in the list.");
        }
    }
}