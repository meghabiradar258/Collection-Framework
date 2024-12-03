package PraticePrograms.HashSet;

import java.util.HashSet;

public class IterateThroughSet {
    public static void main(String[] args) {
        HashSet<String> food= new HashSet<>();
        food.add("pizza");
        food.add("burger");
        food.add("cold drink");
        System.out.println(food);
        for(String a:food)
        {
            System.out.println(a);
        }
    }
}
