package Account;

import java.util.*;

class MainAccountApplication {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("1. Simple Interest \n2. Compound Interest");
        int n = sc.nextInt();

        Account obj = null;
        switch (n) {
            case 1:
                obj = new SimpleInterest();
                break;
            case 2:
                obj = new CompoundInterest();
                break;
            default:
                System.out.println("Invalid");
                System.exit(0);
                break;

        }
        obj.Accept();
        obj.Display();
    }
}
