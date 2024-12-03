package PraticePrograms.HashSet;

import java.util.HashSet;

//4. Write a Java program to empty an hash set.
public class EmptyHashSet {
    public static void main(String[] args) {
        HashSet<String> food = new HashSet<>();
        food.add("pizza");
        food.add("burger");
        food.add("cold drink");
        System.out.println(food);
        food.clear();
        System.out.println(food);

    }
    }

