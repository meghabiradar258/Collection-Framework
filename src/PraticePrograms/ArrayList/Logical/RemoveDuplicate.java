package PraticePrograms.ArrayList.Logical;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicate {
    public static void main(String[] args) {

        ArrayList<Integer> age = new ArrayList<>();
        age.add(10);
        age.add(20);
        age.add(15);
        age.add(22);
        age.add(10);
        age.add(20);
        System.out.println(age);

        Set<Integer> set = new HashSet<>(age);
        System.out.println("ArrayList after removing duplicates " + set);
    }
}