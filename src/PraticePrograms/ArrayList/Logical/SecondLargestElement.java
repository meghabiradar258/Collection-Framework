package PraticePrograms.ArrayList.Logical;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Find the second-largest element in an ArrayList of Integers
public class SecondLargestElement {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(15);
        Collections.sort(list);

        System.out.println("Second Largest Element" + findSecondLargest(list));
    }
       // System.out.println(list.get(list.size() - 2));

    public static Integer findSecondLargest(ArrayList<Integer> list) {

        if (list == null || list.size() < 2) {
            return null;
        }


        Collections.sort(list, Collections.reverseOrder());


        return list.get(1);
    }
}