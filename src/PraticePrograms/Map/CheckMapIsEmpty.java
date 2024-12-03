package PraticePrograms.Map;

import java.util.HashMap;

public class CheckMapIsEmpty {
    public static void main(String[] args) {
        HashMap<Integer,String> Color=new HashMap<>();
        System.out.println( Color.isEmpty());
        Color.put(1,"white");
        Color.put(2,"blue");
        Color.put(3,"purple");
        Color.put(4,"black");

        System.out.println( Color.isEmpty());

    }
}
