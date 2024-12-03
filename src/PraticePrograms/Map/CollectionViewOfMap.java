package PraticePrograms.Map;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

//12. Write a Java program to get a collection view of the values contained in this map.
public class CollectionViewOfMap {
    public static void main(String[] args) {
        // Creating a map with some key-value pairs
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Cherry");


        Collection<String> values = map.values();

        System.out.println("Collection view of the values " + values);
    }
}
