package PraticePrograms.LinkedList;

import java.util.LinkedList;
import java.util.List;

//Create a LinkedList and perform various operations like add, remove, and iterate over it.
public class LinkedListCrudOperation {
    public static void main(String[] args) {
        LinkedList<String> food=new LinkedList<>();
        food.add("poha");
        food.add("dosa");
        food.add("pani-puri");
        food.add("samosa");
        System.out.println(food);
        food.addFirst("pizza");
        food.removeLast();
        food.addLast("burger");
        food.getFirst();
        for(String List :food){
            System.out.println(List);
        }
        food.remove(2);
        food.set(3,"tea");
        System.out.println(food);


    }
}
