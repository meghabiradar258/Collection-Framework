package PraticePrograms.Map;

import java.util.Map;
import java.util.HashMap;
import java.util.Set;


//11. Java Program to Get a Set View of the Keys Contained in a Map
public class SetViewOfMap {
    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Cherry");


        Set<Integer> keySet = map.keySet();
        System.out.println(keySet);
    }

}
