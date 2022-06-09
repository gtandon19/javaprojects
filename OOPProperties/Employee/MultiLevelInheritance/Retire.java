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

   import java.util.*;
class Retire extends Salary  //Multi-level Inheritance
{
    int years, pf, grat;
        
    Retire(int num, String nm, String desig, int basic, int years)
    {
       super(num,nm,desig,basic);
       this.years=years;
    }
 
    void calculator()
    {
        pf=(int)((2.0/100)*basic*12*years);
        if (years>=10)
            grat=basic*12;
        else
            grat=0;
    }
 
    void display()
    {
        super.calculator();
        super.display();
        System.out.println("Retirement Benefits");
        System.out.println("===================");
        System.out.println("PF= "+pf);
        System.out.println("Gratuity= "+grat);
    }
}
 

    void display() {
        super.display();
        System.out.println("PF= " + pf);
        System.out.println("Gratuity= " + grat);
    }
}
