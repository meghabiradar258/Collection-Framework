package PraticePrograms.HashMap;

import java.util.HashMap;

//Create a HashMap to store the mappings of employee IDs to their names
public class MapEmpIdToName {
    public static void main(String[] args) {
        HashMap<Integer,String> emp=new HashMap<>();
        emp.put(1,"Megha");
        emp.put(2,"jaya");
        emp.put(3,"janvi");
        emp.put(4,"minakshi");
        emp.put(5,"maya");
        System.out.println(emp);

    }
}
