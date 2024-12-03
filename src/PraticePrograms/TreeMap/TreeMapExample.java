package PraticePrograms.TreeMap;
//Create a TreeMap and add elements to it. Then, print the elements in sorted order of keys.

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<Integer,String> map=new TreeMap<>();
        map.put(3,"anjali");
        map.put(1,"Megha");
        map.put(2,"jaya");
        map.put(4,"anjali");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("Key " + entry.getKey() + ", Value " + entry.getValue());
        }


    }
}
