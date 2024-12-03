package PraticePrograms.TreeSet;


import java.util.TreeSet;

class Employee implements Comparable<Employee> {
    private String name;
    private int rollNo;

    public Employee(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }


    public String getName() {
        return name;
    }

    public int getRollNo() {
        return rollNo;
    }


    @Override
    public int compareTo(Employee other) {
        return this.rollNo - other.rollNo;
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', rollNo=" + rollNo + "}";
    }
}

public class TreeSetCustomObject {
    public static void main(String[] args) {

        TreeSet<Employee> employees = new TreeSet<>();

        employees.add(new Employee("megha", 101));
        employees.add(new Employee("mahi", 103));
        employees.add(new Employee("janvi", 102));
        employees.add(new Employee("priya", 100));


        System.out.println("TreeSet of custom objects in sorted order");
        for (Employee emp : employees) {
            System.out.println(emp);
        }
    }
}