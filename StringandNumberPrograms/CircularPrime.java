/* 
**Question given by GEMS Modern Academy during preparation of ISC / ICSE Board Exams**
A Circular Prime is a prime number that remains prime under cyclic shifts of its digits. When the leftmost digit is removed and replaced at the end of the remaining string of digits, the generated number is still prime. The process is repeated until the original
number is reached again.
A number is said to be prime if it has only two factors 1 and itself.
Example 1
INPUT :N = 197
OUTPUT:
197
971
719
197 IS A CIRCULAR PRIME Example 2
INPUT :N = 1193
OUTPUT:
1193
1931
9311
3119
1193 IS A CIRCULAR PRIME Example 3
INPUT :N = 29
OUTPUT:
29
92
29 IS NOT A CIRCULAR PRIME
 */

public class CircularPrime {
    // Data members
    int num;

    CircularPrime() {
        num = 197;
    }

    CircularPrime(int n) {
        num = Math.abs(n);
    }

    public boolean isprime(int val) {
        for (int x = 2; x <= val / 2; x++) {
            if (val % x == 0)
                return false;
        }
        return true;
    }

    public int switchnum(int val) {
        if (val / 10 == 0)
            return val;
        // for first digit last:
        String num = String.valueOf(val);
        return Integer.parseInt(num.substring(1) + num.charAt(0));
        // for last digit first: return
        // Integer.parseInt(String.valueOf(val%10)+String.valueOf(val/10));
    }
}