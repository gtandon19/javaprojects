
/**
prime numbers in row wise or coloumn wise or spiral
 */
import java.util.*;

public class Prime2D {
    public void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows then coloumns");
        int r = sc.nextInt(), c = sc.nextInt();
        int N[][] = new int[r][c];
        int n = 2;
        int cnt = 0;
        System.out.println("1. Row; 2. Column; 3. Spiral: Enter");
        int ans = sc.nextInt();
        switch (ans) {

            case 1:
                for (int a = 0, cn = 1; cn < r * c; a++) {
                    for (int p = 0; p < r; p++) {
                        for (int q = 0; q < c; q++) {
                            if (isprime(a)) {
                                N[p][q] = a;
                                cn++;
                            }
                        }
                    }
                }
                break;

            case 2:
                for (int a = 0, cn = 1; cn < r * c; a++) {

                    for (int p = 0; p < c; p++) {
                        for (int q = 0; q < r; q++) {
                            if (isprime(a)) {
                                N[p][q] = a;
                                cn++;
                            }
                        }
                    }
                }
                break;

            case 3:
                int minc = 0, minr = 0;
                int maxc = c - 1, maxr = r - 1;
                int val = 0;
                for (int a = 0, cn = 1; cn < r * c; a++) {
                    // for starting from left:
                    for (int d = minc; d <= maxc; d++) {
                        if (isprime(a)) {
                            cn++;
                            N[minr][d] = a;
                        }
                    }

                    // for going down:
                    for (int d = minr; d <= maxr; d++) {
                        if (isprime(a)) {
                            cn++;
                            N[d][maxc] = a;
                        }
                    }

                    // for going left:
                    for (int d = maxc; d > minc; d--) {
                        if (isprime(a)) {
                            cn++;
                            N[maxr][d] = a;
                        }
                    }

                    // for going up:
                    for (int d = maxr; d < minr; d--) {
                        if (isprime(a)) {
                            cn++;
                            N[minr][d] = a;
                        }
                    }

                }
        }
    }

    public boolean isprime(int j) {
        int cnt = 0;
        for (int y = 1; y < j; y++) {
            if (j % y == 0)
                cnt++;
        }
        if (cnt == 1) // a is prime so you continue
            return true;
        else
            return false;
    }
}
