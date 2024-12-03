package PraticePrograms.ArrayList;

import java.util.ArrayList;

//Write a Java program to retrieve an element (at a specified index) from a given array list.
public class RetriveElement {
    public static void main(String[] args) {

        ArrayList<String> color = new ArrayList<>();
        color.add("blue");
        color.add("pink");
        color.add("black");
        color.add("white");
        String a= color.get(1);
        System.out.println(a);
        String b= color.get(2);
        System.out.println(b);


    }
}
