package PraticePrograms.HashSet;

import java.util.ArrayList;
import java.util.HashSet;
//10. Write a Java program to compare two hash set.
public class CompareHashSet {
    public static void main(String[] args) {
        HashSet<String> color=new HashSet<>();
        color.add("blue");
        color.add("pink");
        color.add("black");
        color.add("white");
        System.out.println("colors in HashSet" + color);
        HashSet<String> color1=new HashSet<>();
        color1.add("purple");
        color1.add("red");
        color1.add("blue");
        color1.add("pink");
        System.out.println("colors in HashSet" + color1);
       if(color.equals(color1))
       {
           System.out.println("haset is equal");
       }
        System.out.println("haset is not equal");
    }
}
