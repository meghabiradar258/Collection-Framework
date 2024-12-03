package PraticePrograms.HashMap;

import java.util.HashMap;

//Create a HashMap to store the mappings of employee IDs to their departments.
public class MapEmpToDept {
    public static void main(String[] args) {
        HashMap<Integer,String> emp= new HashMap<>();
        emp.put(1,"Computer");
        emp.put(2,"Science");
        emp.put(3,"General");
        emp.put(4,"Electrical");
        System.out.println(emp);

    }
}
