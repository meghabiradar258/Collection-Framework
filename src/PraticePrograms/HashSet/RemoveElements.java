package PraticePrograms.HashSet;

import java.util.HashSet;

//12. Write a Java program to remove all elements from a hash set.
public class RemoveElements {
    public static void main(String[] args) {
        HashSet<String> color = new HashSet<>();
        color.add("blue");
        color.add("pink");
        color.add("black");
        System.out.println(color);
        color.remove("pink");
        System.out.println(color);
        color.clear();
        System.out.println(color);
    }
}
