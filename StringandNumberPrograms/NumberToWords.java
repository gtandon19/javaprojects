/*
**Question given by GEMS Modern Academy during preparation of ISC / ICSE Board Exams**
Write a program which accepts a number and displays it in words as shown below.
70456
Seventy Thousand Four Hundred Fifty-six.
The number must be greater >=1 and <=100000
 */

import java.util.*;

public class NumberToWords {
    public void pw(int n, String ch) {
        String one[] = { "", " One", " Two", " Three", " Four", " Five", " Six", " Seven", " Eight", " Nine", " Ten",
                " Eleven", " Twelve", " Thirteen", " Fourteen", "Fifteen", " Sixteen", " Seventeen", " Eighteen",
                " Nineteen" };
        String ten[] = { "", "", " Twenty", " Thirty", " Forty", " Fifty", " Sixty", " Seventy", " Eighty", " Ninety" };
        if (n > 19)
            System.out.print(ten[n / 10] + "" + one[n % 10]);
        else
            System.out.print(one[n]);
        if (n > 0)
            System.out.print(ch);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number more than equal to 1 and less than 100000");
        int n = sc.nextInt();
        System.out.print(n);
        if (n <= 0) {
            System.out.println("Enter numbers greater than 0");
        } else {
            NumberToWords a = new NumberToWords();
            a.pw(((n / 1000) % 100), " Thousand");
            a.pw(((n / 100) % 10), " Hundred");
            a.pw((n % 100), "");
        }
    }

    /*
     * Alternate way to perform the code:
     * public static void main()
     * {
     * 
     * Scanner sc = new Scanner(System.in);
     * String singdig[] = {"","one","two", "three", "four", "five", "six",
     * "seven","eight", "nine","ten"};
     * String twodig[] = {"","eleven", "twelve","thirteen", "fourteen","fifteen",
     * "sixteen", "seventeen","eighteen", "nineteen"};
     * String tens[] =
     * {"","ten","twenty","thirty","forty","fifty","fifty","sixty","seventy",
     * "eighty","ninety"};
     * 
     * System.out.println("Enter number between 1 and 1,00,000");
     * int num = sc.nextInt();
     * 
     * if (num== 100000)
     * System.out.println("Hundred Thousand");
     * else if (num<10)
     * System.out.println(singdig[num]);
     * else if (num<20)
     * System.out.println(twodig[num%10]);
     * else if (num<100)
     * System.out.print(tens[(num/10)] + "" + singdig[num%10]);
     * else if (num<1000)
     * System.out.print( singdig[(num%1000)/100]+" hundred "+ tens[(num%100)/10] +
     * singdig[num%10]);
     * else if (num<10000)
     * System.out.print(singdig[num/1000]+" thousand "+
     * singdig[(num%1000)/100]+" hundred "+ tens[(num%100)/10] + singdig[num%10]);
     * }
     */

}