package PraticePrograms.ArrayList.Logical;

import java.util.ArrayList;
import java.util.Collections;

//Write a program to find the maximum element from an ArrayList of Integers.
public class MaxElement {

    public static void main(String[] args) {
        ArrayList<Integer> age=new ArrayList<>();
        age.add(10);
        age.add(20);
        age.add(15);
        age.add(22);
        System.out.println(age);
        Collections.sort(age);
        System.out.println(age);
    }
}
