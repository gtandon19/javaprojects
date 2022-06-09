package Account;

import java.util.*;

abstract class Account {
    Scanner sc = new Scanner(System.in);
    Scanner sc1 = new Scanner(System.in);
    protected int cust_id;
    protected String cust_name;
    protected int principal;
    protected double rate;
    protected int time;

    Account() {
        cust_id = 00;
        cust_name = " ";
        principal = 100;
        rate = 1;
        time = 1;
    }

    void Accept() {
        System.out.println("Enter customer ID");
        cust_id = sc.nextInt();
        System.out.println("Enter customer name");
        cust_name = sc1.nextLine();
        System.out.println("Enter Principal amt");
        principal = sc.nextInt();
        System.out.println("Enter rate");
        rate = sc.nextDouble();
        System.out.println("Enter time");
        time = sc.nextInt();
    }

    void Display() {
        System.out.println("Customer ID: \n" + cust_id);
        System.out.println("Customer name: \n" + cust_name);

        System.out.println("Principal amt \n" + principal);
        System.out.println("Rate \n" + rate);
        System.out.println("Time \n" + time);
    }

    abstract void Interest_Calc();
}
