package PraticePrograms.ArrayList;
//16. Write a Java program to clone an array list to another array list.

import java.util.ArrayList;

public class ColneArrayList {
    public static void main(String[] args) {
        ArrayList<String> color=new ArrayList<>();
        color.add("blue");
        color.add("pink");
        color.add("black");
        ArrayList <String>list1=(ArrayList<String >)color.clone();
        System.out.println(list1);

    }
}
