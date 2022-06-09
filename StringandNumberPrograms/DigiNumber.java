/*
**Question given by GEMS Modern Academy during preparation of ISC / ICSE Board Exams**
Given two positive numbers M and N, such that M is between 100 and 10000 and N is less than 100. Find the smallest integer that is greater than M and whose digits add up to N. For example, if M=100 and N=11, then the smallest integer greater than 100 whose digits add up to 11 is 119.
Write a program to accept the numbers M and N from the user and print the smallest required number whose sum of all its digits is equal to N. Also, print the total number of digits present in the required number. The program should check for the validity of the inputs and display an appropriate message for an invalid input.
*/

import java.util.*;

public class DigiNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, m;
        System.out.println("Enter m, then enter n");
        m = sc.nextInt();
        n = sc.nextInt();
        if (n < 1 || n >= 100 || m < 100 || m > 10000) {
            System.out.println("INVALID");
            System.exit(0);
        }
        boolean chk = false;
        int numdig = 0;
        int copy;
        int sum = 0;
        for (int i = m; chk == false; i++) {
            copy = i;
            sum = 0;
            numdig = 0;
            while (copy != 0) {
                numdig++;
                sum += copy % 10;
                copy /= 10;
            }
            if (sum == n) {
                System.out.println("The required number is=" + i);
                System.out.println("Total Number of Digits=" + numdig);
                chk = true;
            }
        }
    }
}