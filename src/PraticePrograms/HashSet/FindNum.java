package PraticePrograms.HashSet;

//9. Write a Java program to find numbers less than 7 in a tree set.
import java.util.TreeSet;

public class FindNum {


        public static void main(String[] args) {
            TreeSet<Integer> set = new TreeSet<>();
            set.add(1);
            set.add(3);
            set.add(5);
            set.add(7);
            set.add(9);


            System.out.println("Numbers less than 7 " + set.headSet(7));
        }
    }


