package PraticePrograms.LinkedList;

import java.util.LinkedList;
import java.util.Stack;

//Implement a Stack using the LinkedList class.
public class StackToLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> satck1=new LinkedList<>();
        satck1.push(10);
        satck1.push(52);
        satck1.push(32);
        satck1.push(41);
        System.out.println(satck1);
        System.out.println(satck1.peek());
        System.out.println(satck1.poll());
        System.out.println(satck1.pop());
        System.out.println(satck1.isEmpty());



    }
}
