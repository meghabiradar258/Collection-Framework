package PraticePrograms.ArrayList.Logical;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

//Write a program to sort an ArrayList of Strings alphabetically.
public class SortListAlphabetically {
    public static void main(String[] args) {
        ArrayList<String> food=new ArrayList<>();
        food.add("poha");
        food.add("Dosa");
        food.add("samosa");
        System.out.println(food);
        Collections.sort(food);
        System.out.println(food);
    }
}
