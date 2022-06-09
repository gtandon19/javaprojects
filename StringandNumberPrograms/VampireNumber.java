
/*
**Question given by GEMS Modern Academy during preparation of ISC / ICSE Board Exams**
In mathematics, a vampire number(or true vampire number) is a composite natural number, with an even number ofd igits n, that can be factored into two integers x and y each with n/2 digits and not both with trailing zeroes, where v contains precisely all the digits from x and from y, in any order. x and y are called the fangs.
For example: 1260 is a vampire number, with 21 and 60 as fangs, since 21 × 60 = 1260. However, 126000 (which can be expressed as 21 × 6000 or 210 × 600) is not, as 21 and 6000 do not have the correct length, and both 210 and 600 have trailing zeroes. Similarly, 1023 (which can be expressed as 31 × 33) is not, as although 1023 contains all the digits of 31 and 33, the list of digits of the factors does not coincide with the list of
digits of the original number.
The vampire numbers are:
1260, 1395, 1435, 1530, 1827, 2187, 6880, 102510, 104260, 105210, 105264, 105750, 108135, 110758, 115672, 116725, 117067, 118440, 120600, 123354, 124483, 125248, 125433, 125460, 125500,
*/
import java.util.*;

class VampireNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n;
        System.out.println("please enter the number");
        n = s.nextInt();
        String str = String.valueOf(n);
        int x;
        int y;
        boolean b = false;
        for (int i = 10; i < n; i++) {
            for (int j = 10; j < n; j++) {
                int cnt = 0;
                String str1 = String.valueOf(i);
                String str2 = String.valueOf(j);
                char ch = str1.charAt(str1.length() - 1);
                char ch1 = str2.charAt(str2.length() - 1);
                if (str1.length() == str2.length() && n % i == 0 && n % j == 0) {
                    if (ch == '0' && ch1 == '0') {
                        break;
                    } else {
                        if (i * j == n) {
                            for (int k = 0; k < str.length(); k++) {
                                for (int l = 0; l < str1.length(); l++) {
                                    if (str.charAt(k) == str1.charAt(l) || str.charAt(k) == str2.charAt(l)) {
                                        cnt++;
                                    }
                                }
                            }
                        }
                    }
                }
                if (cnt == str.length()) {
                    b = true;
                    break;
                }
            }
        }
        if (b == true) {
            System.out.println(n + " is a vampire number");
        } else {
            System.out.println(n + " is not a vampire number");
        }
    }
}