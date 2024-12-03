package PraticePrograms.ArrayList;

import java.util.ArrayList;

//Insert an element into the ArrayList at the first position:
public class InsertElement {
    public static void main(String[] args) {
        ArrayList<Integer> age=new ArrayList<>();
        age.add(10);
        age.add(20);
        age.add(30);
        age.add(05);
        age.add(91);
        System.out.println(" elements at arraylist " +age);
        age.add(0,21);
        System.out.println("Updated elements at arraylist " +age);



    }
}
