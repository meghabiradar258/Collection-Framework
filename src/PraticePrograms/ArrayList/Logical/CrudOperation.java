package PraticePrograms.ArrayList.Logical;

import java.util.Iterator;
import java.util.LinkedList;

//Create a LinkedList and perform various operations like add, remove, and iterate over it.
public class CrudOperation {
    public static void main(String[] args) {
        LinkedList<String> list=new LinkedList<>();
        list.addFirst("MCA");
        list.add("Medical");
        list.add("MBA");
        list.addLast("BCA");
        list.add("BBA");

        System.out.println(list);
        list.remove("BBA");
        System.out.println(list);
        list.add("Mcom");
        list.add("MBA");
        list.removeFirst();
        list.removeLast();




        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

}
