package PraticePrograms.ArrayList;

import java.util.ArrayList;

//Write a Java program to create an array list, add some colors (strings) and
// print out the collection.
public class ArrayListProgram {
    public static void main(String[] args) {

        ArrayList<String> color=new ArrayList<>();
        color.add("blue");
        color.add("pink");
        color.add("black");
        color.add("white");
        System.out.println("colors in arraylist" + color);
        ArrayList<String>list1=new ArrayList<>(color.subList(0,3));
        System.out.println("Sub list "+list1);






    }
}
