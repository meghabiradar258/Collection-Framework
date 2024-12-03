package PraticePrograms.Map;

import java.util.HashMap;

//2. Write a Java program to count the number of key-value (size) mappings in a map.
public class CountSizeOfHashMap {
    public static void main(String[] args) {
        HashMap<Integer,String> Color=new HashMap<>();
        Color.put(1,"white");
        Color.put(2,"blue");
        Color.put(3,"purple");
        Color.put(4,"black");
        System.out.println(Color.size());
    }
}
