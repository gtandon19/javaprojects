
/*
**Question given by GEMS Modern Academy during preparation of ISC / ICSE Board Exams**
 A positive whole number “n” is squared and split into two parts that adds up to the original number again. For instance, 45 is a Kaprekar number, because 452 = 2025 and
 20+25 = 45
297 is a Kaprekar number because 2972 = 88209, which can be split into 88 and 209, and 88 + 209 = 297.
The second part may start with the digit 0, but must be non-zero.
For example, 999 is a Kaprekar number because 9992 = 998001, which can be split into 998 and 001, and 998 + 001 = 999. But 100 is not; although 1002 = 10000 and 100 + 00 = 100, the second part here is zero.
The first few Kaprekar numbers in base 10 are:
1, 9, 45, 55, 99, 297, 703, 999, 2223, 2728, 4879, 4950, 5050, 5292, 7272, 7777, 9999, 17344, 22222, 38962, 77778, 82656, 95121, 99999, 142857, 148149, 181819, 187110, 208495, 318682, 329967, 351352, 356643, 390313, 461539, 466830, 499500, 500500, 533170, ..
*/
import java.util.*;

public class KaprekarNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Accepting numbers
        System.out.println("Enter number");
        int n = Math.abs(sc.nextInt());
        int sq = n * n;
        // Convert to string
        String s = String.valueOf(sq);
        if (sq <= 9)
            s = "0" + s;
        // Single digit
        int mid = s.length() / 2; // to find mid point to divide square from
        int left = Integer.valueOf(s.substring(0, mid));
        int right = Integer.valueOf(s.substring(mid));
        if (right == 0)
            System.out.println("It is not a Kaprekar Number - the right half of square is 0.");
        else if (right + left == n)
            System.out.println("It is a Kaprekar Number.");
        else
            System.out.println("It is not a Kaprekar Number.");
    }
}