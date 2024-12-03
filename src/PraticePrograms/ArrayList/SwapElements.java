package PraticePrograms.ArrayList;
//14. Write a Java program that swaps two elements in an array list.

import java.util.ArrayList;
import java.util.Collections;
//14. Write a Java program that swaps two elements in an array list.
public class SwapElements {
    public static void main(String[] args) {
        ArrayList<String> color=new ArrayList<>();
        color.add("blue");
        color.add("pink");
        color.add("black");
        color.add("white");
        System.out.println(color);
        Collections.swap(color,2,3);
        System.out.println(color);
    }
}
