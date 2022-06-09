package Loan;

import java.util.*;

class MainLoanApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 for Vehicle or 2 for Housing.");
        int n = sc.nextInt();
        Loan obj = null;

        if (n % 2 == 0)
            obj = new Housing();
        else
            obj = new Vehicles();

        obj.accept();
        obj.display();
    }
}