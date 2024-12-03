package PraticePrograms.ArrayList;
//21. Write a Java program to replace the second element of an ArrayList with the specified element.

import java.util.ArrayList;

public class ReplaceElement {
    public static void main(String[] args) {
        ArrayList<String> color = new ArrayList<>();
        color.add("blue");
        color.add("pink");
        color.add("black");
        color.add("white");
    color.set(1,"red"); //first way
        System.out.println(color);
        color.remove(1);//second way
        color.add(1,"Purple");
        System.out.println(color);


        //third way
        for (int i = 0; i < color.size(); i++) {
            if (i == 1) {
                color.set(i, "red");              }
        }
        System.out.println("Updated ArrayList: " + color);

    }

}
