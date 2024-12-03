package PraticePrograms.HashSet;

import java.util.HashSet;

//5. Write a Java program to test if a hash set is empty or not.
public class CheckHashIsEmpty
{
    public static void main(String[] args) {
        HashSet<String> color=new HashSet<>();
        color.add("white");
        if(color.isEmpty())
        {
            System.out.println("set is empty");
        }
        else {
            System.out.println("set is not empty" +color);
        }

    }
}
