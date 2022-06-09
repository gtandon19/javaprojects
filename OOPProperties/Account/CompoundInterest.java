package Account;

import java.util.*;

class CompoundInterest extends Account {
    Scanner sc = new Scanner(System.in);
    int account_num;
    double CI;
    double Maturity_amount;

    CompoundInterest() {
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
    }

    public void Interest_Calc() {
        // calculate compound interest
        CI = principal;
        for (int i = 1; i < time; i++)
            CI *= (1 + (rate / 100));
        CI -= principal;
        Maturity_amount = principal + CI;
    }
}
