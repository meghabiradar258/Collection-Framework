package PraticePrograms.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Empolyee {

    private int empId;
    private String empName;
    private String empAddress;
    private String empDepartment;

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpAddress() {
        return empAddress;
    }

    public void setEmpAddress(String empAddress) {
        this.empAddress = empAddress;
    }

    public String getEmpDepartment() {
        return empDepartment;
    }

    public void setEmpDepartment(String empDepartment) {
        this.empDepartment = empDepartment;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", empAddress='" + empAddress + '\'' +
                ", empDepartment='" + empDepartment + '\'' +
                '}';
    }

    public Empolyee(int empId, String empName, String empAddress, String empDepartment) {
        this.empId = empId;
        this.empName = empName;
        this.empAddress = empAddress;
        this.empDepartment = empDepartment;
    }


}

class EmpIdComparator implements Comparator<Empolyee> {

    @Override
    public int compare(Empolyee o1, Empolyee o2) {
        return o1.getEmpId() - o2.getEmpId();
    }
}

class EmpNameComparator implements Comparator<Empolyee>{
    @Override
    public int compare(Empolyee o1, Empolyee o2) {
        return o1.getEmpName().compareTo(o2.getEmpName());
    }
}

class EmpDepartmentComparator implements Comparator<Empolyee>{

    @Override
    public int compare(Empolyee o1, Empolyee o2) {
        return o1.getEmpDepartment().compareTo(o1.getEmpDepartment());
    }
}

