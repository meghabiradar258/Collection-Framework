package PraticePrograms.ArrayList.Logical;

import java.util.ArrayList;

//Write a program to find the intersection of two ArrayLists.
public class Insertion {
    public static void main(String[] args) {
        ArrayList<String> color=new ArrayList<>();
        color.add("blue");
        color.add("pink");
        color.add("black");
        color.add("white");
        color.add("poha");
        color.add("dosa");
        ArrayList<String> food=new ArrayList<>();
        food.add("poha");
        food.add("dosa");
        food.add("pani-puri");
        food.add("samosa");
        food.add("black");
        food.add("white");

        System.out.println(color.retainAll(food));
        System.out.println(color);

    }
}
