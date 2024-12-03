package PraticePrograms.LinkedList;

import java.util.LinkedList;

//Write a program to check if two LinkedLists are equal
public class CheckListIsEmpty {
    public static void main(String[] args) {


    LinkedList<String> list1=new LinkedList<>();
     list1.add("computers");
     list1.add("electrical");
     list1.add("mechanical");

    LinkedList<String> list2=new LinkedList<>();
        list2.add("electrical");
        list2.add("mechanical");
        System.out.println(list1.equals(list2));

}}
