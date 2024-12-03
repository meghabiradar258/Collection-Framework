package PraticePrograms.Map;

import java.util.HashMap;

//Write a Java program to associate the specified value with the specified key in a HashMap.
//
public class HashmapExample {
    public static void main(String[] args) {
        HashMap<Integer,String> Color=new HashMap<>();
        Color.put(1,"white");
        Color.put(2,"blue");
        Color.put(3,"purple");
        Color.put(4,"black");

        System.out.println("Hashmap elements" + Color);
        HashMap<Integer,String> Color1= new HashMap<>(Color);
        System.out.println(Color1);
    }
}
