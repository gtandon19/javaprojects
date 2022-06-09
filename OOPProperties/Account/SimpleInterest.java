package Account;

import java.util.*;

class SimpleInterest extends Account {
    Scanner sc = new Scanner(System.in);
    int account_num;
    double SI;
    double Maturity_amount;

    SimpleInterest() {
        super();
        account_num = 00;
    }

    public void Accept() {
        super.Accept();
        System.out.println("Enter Account Num");
        account_num = sc.nextInt();
        Interest_Calc();
    }

    public void Display() {
        super.Display();
        System.out.println("Account number: " + account_num);
        System.out.println("Interest= " + SI);
        System.out.println("Maturity= " + Maturity_amount);

    }

    public void Interest_Calc() {
        // calculate compound interest
        SI = (principal * rate * time) / 100;
        Maturity_amount = principal + SI;
    }
}