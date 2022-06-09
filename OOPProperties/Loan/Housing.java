package Loan;

import java.util.*;

public class Housing extends Loan

{
    String type;
    int cost;

    public void accept() {
        Scanner sc = new Scanner(System.in);
        super.accept();
        System.out.println("House type");
        type = sc.nextLine();
        System.out.println("Cost:");
        cost = sc.nextInt();
    }

    public void display() {
        super.display();
        System.out.println(type);
    }
}
