package PraticePrograms.ArrayList;

import java.util.ArrayList;

//Write a Java program to iterate through all elements in an array list.
public class ItreateThroughArray {
    public static void main(String[] args) {

        ArrayList<String> color = new ArrayList<>();
        color.add("blue");
        color.add("pink");
        color.add("black");
        color.add("white");
        for(String a:color)

        {
            System.out.println("all elements in an array list  " +a);
        }

    }
}
