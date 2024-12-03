package PraticePrograms.LinkedList;

import java.util.LinkedList;
import java.util.Queue;

//Implement a Queue using the LinkedList class.
public class QueueToLinkedList {
    public static void main(String[] args) {
        Queue<String> list=new LinkedList<>();
        list.add("Hello");
        list.add("hi");
        list.add("welcome");
        list.add("new");
        System.out.println(list);
        System.out.println(list.peek());
        System.out.println(list.poll());
        System.out.println(list);
        System.out.println(list.isEmpty());

    }
}
