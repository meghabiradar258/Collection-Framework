package PraticePrograms.HashSet;

import java.util.HashSet;

//1. Write a Java program to append the specified element to the end of a hash set.
public class AppendElement {
    public static void main(String[] args) {
        HashSet <String> food= new HashSet<>();
        food.add("pizza");
        food.add("burger");
        food.add("cold drink");
        System.out.println(food);
        food.add("samosa");
        System.out.println(food);
    }
}

