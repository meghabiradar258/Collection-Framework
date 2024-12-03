package PraticePrograms.Map;

import java.util.HashMap;

//6. Write a Java program to get a shallow copy of a HashMap instance.
public class ShallowCopyOfMap {
    public static void main(String[] args) {
        HashMap<Integer, String> Color = new HashMap<>();
        System.out.println(Color.isEmpty());
        Color.put(1, "white");
        Color.put(2, "blue");
        Color.put(3, "purple");
        HashMap<String, String> shallowCopy = (HashMap<String, String>) Color.clone();
        System.out.println("Shallow copy of the map " + shallowCopy);

    }

}
