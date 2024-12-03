package PraticePrograms.HashSet;

import java.util.HashSet;
import java.util.TreeSet;
//8. Write a Java program to convert a hash set to a tree set.
public class HashSetToTreeSet {
    public static void main(String[] args) {


        HashSet<String> food = new HashSet<>();
        food.add("poha");
        food.add("vadapav");
        food.add("samosa");
        System.out.println(food);
        TreeSet<String> treeSet = new TreeSet<>(food);

        System.out.println("HashSet as TreeSet: " + treeSet);
    }
}