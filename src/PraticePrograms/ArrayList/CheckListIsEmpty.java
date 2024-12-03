package PraticePrograms.ArrayList;

import java.util.ArrayList;

//18. Write a Java program to test whether an array list is empty or not.
public class CheckListIsEmpty {
    public static void main(String[] args) {
        ArrayList<Integer> age=new ArrayList<>();
        age.add(10);
        age.add(20);
        age.add(30);
        age.add(05);
        age.add(91);
       if(age.isEmpty()) {
           System.out.println("arraylist is empty");
       }
       else {
           System.out.println("arraylist is not  empty" +age);
       }

    }
}
