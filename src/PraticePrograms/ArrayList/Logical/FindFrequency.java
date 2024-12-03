package PraticePrograms.ArrayList.Logical;

import java.util.ArrayList;
import java.util.HashMap;

public class FindFrequency {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(10);
        list.add(30);
        list.add(20);
        list.add(40);

        System.out.println("Element Frequencies " + findFrequency(list));
    }

    public static HashMap<Integer, Integer> findFrequency(ArrayList<Integer> list) {
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();

        for (int num : list) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        return frequencyMap;
    }
}



