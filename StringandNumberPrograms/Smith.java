
/*
**Question given by GEMS Modern Academy during preparation of ISC / ICSE Board Exams**
A Smith number is a composite number, the sum of whose digits is the sum of the digits of its prime factors obtained as a result of prime factorization (excluding 1).
Example: Number – 666
Prime factors are 2, 3, 3, and 37
Sum of the digits are (6+6+6) = 18
Sum of digits of the prime factors (2+3+3+3+7) = 18
Sample Input data:
Input: 94 Input: 102 Input: 999 Input: 493775
Output: Smith Number Output: Not a Smith Number
Output: Not a Smith Number Output: Not a Smith Number
*/
import java.util.Scanner;

public class Smith {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int copy, n;
        n = sc.nextInt();
        copy = n;
        if (PrimeFac(n) == SumDig(n))
            System.out.println("It is a Smith Number");
        else
            System.out.println("It is not a Smith Number");
    }

    public static int PrimeFac(int num) {
        int cnt = 0;
        for (int i = 2; num != 1; i++) {
            while (num % i == 0) {
                num /= i;
                if (i > 9)
                    cnt += SumDig(i);
                else
                    cnt += i;
            }
        }
        return cnt;
    }

    public static int SumDig(int copy) {
        int sumdig = 0;
        while (copy != 0) {
            sumdig += copy % 10;
            copy /= 10;
        }
        return sumdig;
    }
}