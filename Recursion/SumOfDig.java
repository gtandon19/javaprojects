/* Simple program to calculate sum of all the digits in a number recursively. */
public class SumOfDig {
    public static int sum(int n) {
        if (n == 0)
            return 0;
        else
            return sum(n / 10) + n % 10;
    }

    public static void main(String[] args) {
        System.out.println(sum(2475));
    }
}
