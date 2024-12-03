package PraticePrograms.HashSet;

//7. Write a Java program to convert a hash set to an array.

import java.util.HashSet;

public class ConvertSetToArray {
    public static void main(String[] args) {

        HashSet<String> food =new HashSet<>();
        food.add("poha");
        food.add("vadapav");
        food.add("samosa");
        System.out.println(food);
        String arr[]=food.toArray(new String[0]);
        for (String a:food)
        {
            System.out.println(a);
        }
    }
}
