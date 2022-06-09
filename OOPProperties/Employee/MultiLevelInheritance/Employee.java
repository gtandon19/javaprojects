package Employee.MultiLevelInheritance;

import java.util.*;

abstract public class Employee {
    int empNo;
    String empName;
    String empDesig;

    Employee() {
        Scanner sc = new Scanner(System.in);
        Scanner strsc = new Scanner(System.in);

        System.out.println("Enter Number, name, then designation");
        empNo = sc.nextInt();
        empName = strsc.nextLine();
        empDesig = strsc.nextLine();
    }

    Employee(int num, String name, String designation) {
        empNo = num;
        empName = name;
        empDesig = designation;
    }

    void display() {
        System.out.println("Emp Num = " + empNo);
        System.out.println("Emp Name = " + empName);
        System.out.println("Emp Designation = " + empDesig);
    }

    abstract void calculator();

}
