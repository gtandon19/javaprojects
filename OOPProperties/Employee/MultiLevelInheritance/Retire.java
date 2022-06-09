package Employee.MultiLevelInheritance;

import java.util.*;

class Retire extends Employee {
    int years;
    double pf;
    double grat;
    double basic;
    Scanner sc = new Scanner(System.in);

    Retire() {
        super();
        System.out.println("Enter salary");
        basic = sc.nextInt();
        System.out.println("Enter num of years");
        years = sc.nextInt();
    }

    Retire(double basic, int years) {
        super();
        this.basic = basic;
        this.years = years;
    }

    void calculator() {
        pf = (2 / 100) * basic * years;
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
