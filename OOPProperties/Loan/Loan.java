package Loan;

import java.util.*;

public class Loan {
    DATE obj = new DATE();
    DATE doc = null;
    int mobnum;
    String name;

    public void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter \nName \nMobile \nDate of creation");
        name = sc.nextLine();
        mobnum = sc.nextInt();
        doc = new DATE(sc.nextInt(), sc.nextInt(), sc.nextInt());
    }

    public void display() {
        System.out.print("Name: " + name + "\n Mobile: " + mobnum + "\n");
        doc.Dispdate();
    }
}