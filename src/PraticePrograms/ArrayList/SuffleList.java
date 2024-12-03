package PraticePrograms.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

//10. Write a Java program to shuffle elements in an array list.
public class SuffleList {
    public static void main(String[] args) {
        ArrayList<Integer> age=new ArrayList<>();
        age.add(10);
        age.add(20);
        age.add(30);
        age.add(05);
        age.add(91);
        System.out.println(age +" list before suffle");
        Collections.shuffle(age);
        System.out.println(age +" list after suffle");
    }
}
