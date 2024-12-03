package PraticePrograms.HashSet;

import java.util.HashSet;

public class CopyHashSet {
    public static void main(String[] args) {
        HashSet<String> color = new HashSet<>();
        color.add("white");
        color.add("blsck");
        System.out.println(color);
        HashSet<String> set1=(HashSet<String>) color.clone();
        System.out.println(set1);



    }
}
