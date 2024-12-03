package PraticePrograms.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorTest {


        public static void main(String[] args) {
            Empolyee e1 = new Empolyee(1,"Emp1", "Pune", "Development");
            Empolyee e2 = new Empolyee(2,"Java", "Noida", "S/W Development");
            Empolyee e3 = new Empolyee(3,"Spring", "Delhi", "App Development");
            Empolyee e4 = new Empolyee(4,"Hibernate", "Bengaluru", " Web Development");
            Empolyee e5 = new Empolyee(5,"SQL", "Pune", "Test Development");

            List<Empolyee> employeeList = new ArrayList<>();
            employeeList.add(e4);
            employeeList.add(e1);
            employeeList.add(e3);
            employeeList.add(e5);
            employeeList.add(e2);

            System.out.println("Before sorting "+employeeList);
            EmpIdComparator empIdComparator = new EmpIdComparator();
            Collections.sort(employeeList, empIdComparator);
            EmpNameComparator empNameComparator = new EmpNameComparator();
            Collections.sort(employeeList, empNameComparator);
            System.out.println("After sorting "+employeeList);


    }

}
