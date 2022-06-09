
/**
Factorial
 */
import java.util.Scanner;

class FactorialRecursion {
    /* this is a recursive method */
    static int fact(int n) {
        // base case
        if (n == 1)
            return 1;
        return fact(n - 1) * n;
        // recursive part
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of the factorial you desire:");
        int n = fact(sc.nextInt());
        System.out.println(n);
    }
}
