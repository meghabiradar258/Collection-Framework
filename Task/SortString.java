package Task;

import java.util.*;

public class SortString {
    public static void main(String[] args) {
        List<String> name= Arrays.asList("Megha","Anjali","Jaya","Shiva","Arpita","Aai","Shubham","Anuja","Mahesh","Arti");
        System.out.println(name);
        List<String>newList=new ArrayList<>();


       for(String list1:name){
        if(list1.toUpperCase().startsWith("A"))
           {
               newList.add(list1);
           }

    }

        Collections.sort(newList, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Integer.compare(o1.length(), o2.length());
            }
        });
        System.out.println("Name Start With A -According to its length");
        for (String NamesStartWithA : newList) {
            System.out.println( NamesStartWithA );
        }

}}
Output:
[Megha, Anjali, Jaya, Shiva, Arpita, Aai, Shubham, Anuja, Mahesh, Arti]
Name Start With A -According to its length
Aai
Arti
Anuja
Anjali
Arpita

