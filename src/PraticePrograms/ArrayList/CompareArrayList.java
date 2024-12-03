package PraticePrograms.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

//13. Write a Java program to compare two array lists.
public class CompareArrayList {
    public static void main(String[] args) {
        ArrayList<String> color=new ArrayList<>();
        color.add("blue");
        color.add("pink");
        color.add("black");
        color.add("white");
        System.out.println("colors in arraylist" + color);
        ArrayList<String> color1=new ArrayList<>();
        color1.add("purple");
        color1.add("red");
        color1.add("blue");
        color1.add("pink");
        color1.add("black");
        System.out.println("colors in arraylist" + color1);
        System.out.println(color.equals(color1));
        //numbers
        ArrayList<Integer> age=new ArrayList<>();
        age.add(10);
        age.add(25);
        age.add(15);
        age.add(30);
        ArrayList<Integer> age1=new ArrayList<>();
        age1.add(30);
        age1.add(25);
        age1.add(15);
        age1.add(10);

        Collections.sort(age);
        Collections.sort(age1);
        System.out.println(age);
        System.out.println(age1);
        System.out.println(age.equals(age1));


    }
}
