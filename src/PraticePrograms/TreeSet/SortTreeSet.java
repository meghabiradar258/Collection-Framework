package PraticePrograms.TreeSet;

import java.util.TreeSet;

public class SortTreeSet {
    public static void main(String[] args) {
        TreeSet<Integer> set=new TreeSet<>();
        set.add(10);
        set.add(20);
        set.add(10);
        set.add(10);
        set.add(10);
   ;

        System.out.println("orted order");
        for (Integer element : set) {
            System.out.println(element);
        }
    }
}

