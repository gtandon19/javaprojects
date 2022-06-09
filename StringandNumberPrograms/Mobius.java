
/*
**Question given by GEMS Modern Academy during preparation of ISC / ICSE Board Exams**
Write a program to accept a positive number and determine its Mobius function.
The mobius function M(n) for a natural number ‘n’ is defined as follows: M(n) = 1 if n = 1
M(n) = 0 if any prime factor of n is contained in n more than once M(n) = (-1)p if n is a product of p distinct prime factors.
Example : n = 78 Mobius of n = -1 ( 78 = 2 * 3 * 13 ) n = 12 Mobius of n = 0 ( 12 = 2 * 2 * 3 )
 */
import java.util.*;

public class Mobius {
    public static boolean UniqPrime(int num) {
        int cnt = 0;
        for (int i = 2; num != 1; i++) {
            while (num % i == 0) {
                cnt++;
                num /= i;
                if (cnt > 1) {
                    return false;
                }
            }
            cnt = 0;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check Mobius Function.");
        int n = Math.abs(sc.nextInt());
        if (n == 1) {
            System.out.println("Mobius of " + n + " = 1");
            System.exit(0);
        }
        if (UniqPrime(n))
            System.out.println("Mobius of " + n + " = -1");
        else
            System.out.println("Mobius of " + n + " = 0");
    }
}