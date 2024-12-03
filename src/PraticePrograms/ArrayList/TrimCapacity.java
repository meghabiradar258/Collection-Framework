package PraticePrograms.ArrayList;

import java.util.ArrayList;

//19. Write a Java program for trimming the capacity of an array list.
public class TrimCapacity {


        public static void main(String[] args) {

            ArrayList<Integer> list = new ArrayList<>();
            list.add(1);
            list.add(2);
            list.add(3);

            System.out.println("Size " + list.size());
            list.trimToSize();
             list.add(4);
             list.add(5);

            list.trimToSize();

            System.out.println("Size " + list.size());

            if (list.size() == list.toArray().length) {
                System.out.println("The capacity is trimmed to match the size.");
            } else {
                System.out.println("The capacity is not trimmed.");
            }
        }
    }


