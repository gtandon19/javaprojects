
/*
**Question given by GEMS Modern Academy during preparation of ISC / ICSE Board Exams**
TWIN PRIMES
Twins primes are consecutive prime numbers whose difference is 2. For example, (3,5), (11,13), (17,19) are all twin primes. We define the distance of any twin prime pair from a positive integer as follows.
If (p1, p2) is a twin prime pair and n is a positive integer then the distance of the twin prime from n is:
minimum(abs(n-p1), abs(n-p2)) where abs returns the absolute value of its argument, and minimum returns the smaller of its two arguments.
Write a program that reads in a positive integer n and prints out the twin prime pair that has the least distance from n.
For example if n is 30 the pair is (29,31), if n is 13 it is (11,13), if n is 49 it is (41,43). If n
is 54 it is (59,61). Sample data:
Input:
Enter a number : 34 Output:
Number read in is : 34 p1=29 p2=31
Input:
Enter a Number : 60 Output:
Number read in is 60 p1=59 p2=61
 */
import java.util.*;

class TwinPrime {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n;
        System.out.println("Enter the number");
        n = s.nextInt();
        int p1 = 0;
        int p2 = 0;
        int i = n;
        int j = n;
        while (i > 0 || j < n) {
            if (Prime(i) == true && Prime(i + 2) == true) {
                p1 = i;
                p2 = i + 2;
                break;
            }
            if (Prime(i) == true && Prime(i - 2) == true) {
                p1 = i;
                p2 = i - 2;
                break;
            }
            if (Prime(j) == true && Prime(j + 2) == true) {
                p1 = i;
                p2 = j + 2;
                break;
            }
            if (Prime(j) == true && Prime(j - 2) == true) {
                p1 = i;
                p2 = j - 2;
                break;

            }
            i--;
            j++;
        }
        if (p1 > p2) {
            int tmp = p1;
            p1 = p2;
            p2 = tmp;
        }
        System.out.print("Number read in is " + n + " p1=" + p1 + " p2=" + p2);
    }

    public static boolean Prime(int n) {
        boolean b = true;
        if (n == 1) {
            System.out.println("Please enter another number");
            return false;
        }
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                b = false;
                break;
            }
        }
        return b;
    }
}