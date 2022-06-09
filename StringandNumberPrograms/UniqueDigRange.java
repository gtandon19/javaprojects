
/*
**Question given by GEMS Modern Academy during preparation of ISC / ICSE Board Exams**
A unique-digit integer is a positive integer (without leading zeros) with no duplicates digits. For example 7,135,214 are all unique-digit integers whereas 33, 3121, 300 are not.
Given two positive integers m and n, where m < n, write a program to determine how many unique-digit integers are there in the range between m and n (both inclusive) and output them.
The input contains two positive integers m and n. Assume m < 30000 and n < 30000. You are to output the number of unique-digit integers in the specified range along with their values in the format specified below:
SAMPLE DATA:
INPUT:
m = 100 n = 120
OUTPUT:
THE UNIQUE-DIGIT INTEGERS ARE:
102, 103, 104, 105, 106, 107, 108, 109, 120. FREQUENCY OF UNIQUE-DIGIT INTEGERS IS : 9
INPUT:
m = 2500 n = 2550
OUTPUT:
THE UNIQUE-DIGIT INTEGERS ARE:
2501, 2503, 2504, 2506, 2507, 2508, 2509, 2510, 2513, 2514, 2516, 2517, 2518, 2517, 2530, 2519, 2530, 2531, 2534, 2536, 2537, 2538, 2539, 2540, 2541, 2543, 2546, 2547, 2548, 2549.
FREQUENCY OF UNIQUE-DIGIT INTEGERS IS: 28.
 */
import java.util.*;

public class UniqueDigRange {
    public static boolean Norep(int num) {
        int cnt = 0;
        for (int i = 0; i < 10; i++) {
            cnt = 0;
            for (int j = num; j != 0; j /= 10) {
                if (j % 10 == i)
                    cnt++;
            }
            if (cnt > 1)
                return false;
        }
        return true;
    }

    /*
     * Alternate algorithm to check if a number is unique:
     * 
     * int n=466234;
     * int num=n;
     * int arr[] = new int[10];
     * System.out.println();
     * for (num=n;num!=0;num/=10)
     * {
     * arr[num%10]++;
     * }
     * boolean uniquedig = true;
     * for (int i=0;i<arr.length;i++)
     * if (arr[i] >1)
     * uniquedig = false;
     * 
     * if (uniquedig == false)
     * System.out.println("Not unique");
     * else
     * System.out.println("Unique");
     * 
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m, n;
        System.out.println("Enter m, then enter n");
        m = sc.nextInt();
        n = sc.nextInt();
        System.out.println("Unique digit numbers:");
        if (n >= 30000 || m >= 30000) {
            System.out.println("INVALID");
            System.exit(0);
        }
        if (m > n) {
            int temp = m;
            m = n;
            n = temp;
        }
        int freq = 0;
        for (int i = m; i <= n; i++) {
            if (Norep(i)) {
                System.out.println(i);
                freq++;
            }
        }
        System.out.println("Frequency is: " + freq);
    }
}
