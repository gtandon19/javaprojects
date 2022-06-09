package Loan;

import java.util.*;

public class Vehicles extends Loan {
    String type;

    public void accept() {
        Scanner sc = new Scanner(System.in);
        super.accept();
        System.out.println("Vehicle type");
        type = sc.nextLine();

    }

    public void display() {
        super.display();
        System.out.println(type);
    }
}
