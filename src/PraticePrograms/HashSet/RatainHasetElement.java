package PraticePrograms.HashSet;

import java.util.HashSet;

//11. Write a Java program to compare two sets and retain elements that are the same.
//
public class RatainHasetElement {
    public static void main(String[] args) {
        HashSet<String> color = new HashSet<>();
        color.add("blue");
        color.add("pink");
        color.add("black");
        color.add("white");
        System.out.println("colors in HashSet" + color);
        HashSet<String> color1 = new HashSet<>();
        color1.add("purple");
        color1.add("red");
        color1.add("blue");
        color1.add("pink");
        System.out.println("colors in HashSet" + color1);
    color.retainAll(color1);
        System.out.println(color);

    }
}
