package PraticePrograms.ArrayList.Logical;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Write a program to shuffle the elements of an ArrayList.
public class ShuffleElement {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        Collections.shuffle(list);
        System.out.println(list);

    }


}
