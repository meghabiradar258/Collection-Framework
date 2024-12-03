package PraticePrograms.ArrayList.Logical;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SmallestElement {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(50);
        list.add(20);
        list.add(40);
        list.add(30);
        int k = 3;
      Scanner scanner=new Scanner(System.in);
      scanner.nextInt(k);

        System.out.println("Kth Smallest Element: " + findKthSmallest(list, k));
    }

    public static Integer findKthSmallest(ArrayList<Integer> list, int k) {
        if (list == null || k > list.size() || k <= 0) {
            return null; // Invalid input
        }

        Collections.sort(list); // Sort the list in ascending order
        return list.get(k - 1); // Return the Kth smallest element
    }
}