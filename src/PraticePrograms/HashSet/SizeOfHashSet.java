package PraticePrograms.HashSet;

import java.util.HashSet;
//3. Write a Java program to get the number of elements in a hash set.

public class SizeOfHashSet {
    public static void main(String[] args) {
        HashSet<String> food = new HashSet<>();
        food.add("pizza");
        food.add("burger");
        food.add("cold drink");
        System.out.println(food.size());

    }
}
