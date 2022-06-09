package Employee.MultiLevelInheritance;

import java.util.*;

class Salary extends Employee {
    double basic;
    double DA;
    double Gross_salary;
    double PF;
    double Net_salary;
    Scanner sc = new Scanner(System.in);
    Scanner strsc = new Scanner(System.in);

    Salary() {
        super();
        System.out.println("Enter basic");
        basic = sc.nextInt();
    }

    Salary(int num, String name, String desig, int pay) {
        super(num,name,desig);
        basic = pay;
    }

    void calculator() {
        DA = (50.0 * basic) / 100;
        double HRA = (15.0 * basic) / 100;
        Gross_salary = basic + DA + HRA;
        PF = (8.0 * Gross_salary) / 100;
        Net_salary = Gross_salary - PF;
    }

    void display() {
        super.display();
        System.out.println("Basic = " + basic);
        System.out.println("Dearness allowance = " + DA);
        System.out.println("Gross salary= " + Gross_salary);
        System.out.println("PF= " + PF);
        System.out.println("Net Salary= " + Net_salary);
    }
}
