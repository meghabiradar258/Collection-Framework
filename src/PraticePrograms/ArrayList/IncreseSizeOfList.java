package PraticePrograms.ArrayList;

import java.util.ArrayList;

//20. Write a Java program to increase an array list size.
public class IncreseSizeOfList {
    public static void main(String[] args) {
        ArrayList<String> color=new ArrayList<>();
        color.add("blue");
        color.add("pink");
        color.add("black");
        color.add("white");
        System.out.println("colors in arraylist" + color);
        color.ensureCapacity(7);   //first way
        color.trimToSize();                   //2nd way
        color.add("purple");                  //3rd way
        System.out.println("After  " + color);
    }
}
