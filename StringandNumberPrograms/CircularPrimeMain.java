
/*
**Question given by GEMS Modern Academy during preparation of ISC / ICSE Board Exams**
 * This is the class that performs execution of circularqueue
 * For example: 197 is a prim
 * Shifted, it becomes 971, which is a prime
 * Shifted it becomes 719
 * Hence, it is a circular prime.
 */
import java.util.Scanner;

public class CircularPrimeMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CircularPrime obj = new CircularPrime();
        System.out.println("Hi! Enter a number to check for Circular prime!");
        int val;
        val = Math.abs(sc.nextInt());
        boolean chk = true;

        do {
            System.out.print(val + " ");

            if (obj.isprime(val) == false) {
                chk = false;
                break;
            }
            val = obj.switchnum(val);
        } while (val != obj.num);

        if (chk == true)
            System.out.println(val + " IS A CIRCULAR PRIME");
        else
            System.out.println(val + " IS NOT A CIRCULAR PRIME");
    }
}