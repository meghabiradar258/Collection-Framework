package PraticePrograms.Map;

import java.util.HashMap;

//4. Write a Java program to remove all mappings from a map.
//
public class RemoveMap {
    public static void main(String[] args) {
        HashMap<Integer,String> Color=new HashMap<>();
        Color.put(1,"white");
        Color.put(2,"blue");
        Color.put(3,"purple");
        Color.put(4,"black");
        System.out.println(Color);
        Color.clear();
        System.out.println(Color);
    }
}
