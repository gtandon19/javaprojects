package Employee.HierarchiacalInheritance;

import java.util.*;

//Employee Class
abstract public class EmployeeHierarchiacalImplementation {
    int empNo;
    String empName;
    String empDesig;

    EmployeeHierarchiacalImplementation(int num, String name, String designation) {
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
// Retire class

class Retire1 extends EmployeeHierarchiacalImplementation {
    int years;
    double pf;
    double grat;
    double basic;

    Retire1(int num, String nm, String desig, double basic, int years) {
        super(num, nm, desig);
        this.basic = basic;
        this.years = years;
    }

    void calculator() {
        pf = (2.0 / 100) * basic * years;
        if (years >= 10)
            grat = basic;
        else
            grat = 0;
    }

    void display() {
        super.display();
        System.out.println("PF= " + pf);
        System.out.println("Gratuity= " + grat);
    }
}
// main class

class Salary1 extends EmployeeHierarchiacalImplementation {
    int years;
    double pf;
    double grat;
    double basic;

    Salary1(int num, String nm, String desig, double basic) {
        super(num, nm, desig);
        this.basic = basic;

    }

    void calculator() {
        pf = (2.0 / 100) * basic * years;
        if (years >= 10)
            grat = basic;
        else
            grat = 0;
    }

    void display() {
        super.display();
        System.out.println("PF= " + pf);
        System.out.println("Gratuity= " + grat);
    }
}

class Empmain1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ch = 99;
        EmployeeHierarchiacalImplementation obj = null;

        do {
            System.out.println("Menu:");
            System.out.println("1. Generate payslip \n2. Calculate Retirement Benefits \n3. Exit");
            System.out.println("Make choice");
            ch = sc.nextInt();

            switch (ch) {
                case 1:
                    obj = new Salary1(1001, "TOM", "MANAGER", 4500);
                    break;
                case 2:
                    obj = new Retire1(1101, "DICK", "ACCOUNTANT", 4500, 15);
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Incorrect-Enter again");

                    break;

            }
            obj.calculator();
            obj.display();

        } while (ch != 0);
    }
}