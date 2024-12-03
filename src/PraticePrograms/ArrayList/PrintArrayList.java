package PraticePrograms.ArrayList;

import java.util.ArrayList;

import java.util.Iterator;
//22. Write a Java program to print all the elements of an
// ArrayList using the elements' position
public class PrintArrayList {
    public static void main(String[] args) {
        ArrayList<String> color = new ArrayList<>();
        color.add("blue");
        color.add("pink");
        color.add("black");
        color.add("white");
        //first way
        for (int i = 0; i < color.size(); i++) {
            System.out.println("Element at index " + i + color.get(i));
        }
        //second way

        Iterator<String> iterator = color.iterator();
        int index = 0;
        while (iterator.hasNext()) {
            System.out.println("Element at index " + index  + iterator.next());
            index++;
        }
    }
}
