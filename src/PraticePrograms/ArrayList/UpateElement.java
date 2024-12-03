package PraticePrograms.ArrayList;

import java.util.ArrayList;
//5. Write a Java program to update an array element by the given element.
public class UpateElement {

        public static void main(String[] args) {
            ArrayList<String> list = new ArrayList<>();
            list.add("Apple");
            list.add("Banana");
            list.add("Cherry");


            list.set(1, "Blueberry");

            System.out.println(list);
        }
    }

