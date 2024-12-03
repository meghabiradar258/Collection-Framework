package PraticePrograms.TreeMap;

import java.util.Map;
import java.util.TreeMap;

//Create a TreeMap to store the mappings of book titles to their authors.
public class MapBookName {
    public static void main(String[] args) {

        TreeMap<String, String> bookAuthors = new TreeMap<>();


        bookAuthors.put("yayati", "v .s khadekar");
        bookAuthors.put("shan chi aai", "sane guruji");
        bookAuthors.put("abc", "xyz");




        for (Map.Entry<String, String> entry : bookAuthors.entrySet()) {
            System.out.println("Book " + entry.getKey() + ", Author: " + entry.getValue());
        }
    }
}