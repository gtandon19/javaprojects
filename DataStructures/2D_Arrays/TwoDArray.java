
import java.util.*;

public class TwoDArray {
    Scanner sc = new Scanner(System.in);

    int M[][];
    int m, n;

    TwoDArray() {

        m = n = 0;
        M = null;
    }

    TwoDArray(int r, int c) {
        m = Math.abs(r);
        n = Math.abs(c);

        M = new int[m][n];
    }

    public void accept() {
        if (m == 0 && n == 0) {
            System.out.println("Enter rows then coloumns");
            m = sc.nextInt();
            n = sc.nextInt();
            M = new int[m][n];
        }

        System.out.println("Please enter values row wise");

        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[i].length; j++) {
                M[i][j] = sc.nextInt();
            }
        }
    }

    public void display() {

        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[i].length; j++) {
                System.out.print(M[i][j]);
            }
            System.out.println("");
        }
    }

    public int maximum() {
        int max = 0;
        for (int i = 0; i < M.length; i++) {

            for (int j = 0; j < M[i].length; j++) {
                if (M[i][j] > max)
                    max = M[i][j];
            }

        }
        return max;
    }

    public int minimum() {
        int min = 0;
        for (int i = 0; i < M.length; i++) {

            for (int j = 0; j < M[i].length; j++) {
                if (M[i][j] < min)
                    min = M[i][j];
            }

        }
        return min;
    }

    public void search(int x) {
        for (int i = 0; i < M.length; i++) {

            for (int j = 0; j < M[i].length; j++) {
                if (M[i][j] == x) {
                    System.out.println("Row: " + i + " coloumn: " + j);
                    return;
                }
            }

        }
    }

    int leftdiag() {
        int sum = 0;
        if (m != n) {
            System.out.println("Not possible");
            return 0;
        }
        for (int i = 0; i < M.length; i++) {
            sum += M[i][i];
        }
        return sum;
    }

    int rightdiag() {
        int sum = 0;
        if (m != n) {
            System.out.println("Not possible");
            return 0;
        }
        for (int i = 0, j = M.length; i < M.length; i++, j--) {
            sum += M[i][j];
        }
        return sum;
    }

    /**
     * void add(TWOD_ARRAY N1, TWOD_ARRAY N2) : Adds up the elements in the two
     * objects and stores the result in the object that is invoking the function.
     * Note : The two objects (N1 and N2) must have the same number of rows and
     * columns.
     */
    void add(TwoDArray N1, TwoDArray N2) {// adding 2 arrays, with the corresponding elements
        int y[][] = new int[m][n];
        y = N1.M;
        int x[][] = new int[m][n];
        x = N2.M;
        int k[][] = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                k[i][j] = y[i][j] + x[i][j];
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println(k[i][j]);
            }
        }
    }

    // void Trans (TWOD_ARRAY N1) : Transposes the elements in the object N1 and
    // stores it in the object that is invoking the function.
    public void transfer(TwoDArray n1) {
        if (n1.m == this.m && n1.n == this.n) {
            for (int a = 0; a < m; a++) {
                for (int b = 0; b < n; b++) {
                    this.M[a][b] = n1.M[a][b];

                }
            }
        }
    }

    public TwoDArray multiply(TwoDArray N2) {// mulitplying assuming the basic condition is satisfied
        int firstarray[][] = new int[m][n];
        firstarray = N2.M;

        /*
         * Create another 2d array to store the result using the original arrays'
         * lengths on row and column respectively.
         */
        int[][] result = new int[firstarray.length][M[0].length];

        /* Loop through each and get product, then sum up and store the value */
        for (int i = 0; i < firstarray.length; i++) {
            for (int j = 0; j < M[0].length; j++) {
                for (int k = 0; k < firstarray[0].length; k++) {
                    result[i][j] += firstarray[i][k] * M[k][j];
                }
            }
        }
        TwoDArray c = new TwoDArray();
        c.M = result;
        return c;
    }

    /**
     * Overload a sort() method in the class TWOD_ARRAY (which was completed in Term
     * 2)
     * that would sort the rows in the Matrix in either Ascending order or
     * Descending order based
     * on a specified column.
     * Sample Input
     * 21 87 76 93
     * 22 87 67 80
     * 23 89 78 56
     * 24 90 89 98
     * Example 1:
     * Enter Column Number for sorting: 4
     * Output: (as per descending order of column 4)
     * 24 90 89 98
     * 21 87 76 93
     * 22 87 67 80
     * 23 89 78 56
     * Example 2:
     * Enter Column Number for sorting: 1
     * Output: (as per descending order of column 1)
     * 24 90 89 98
     * 23 89 78 56
     * 22 87 67 80
     * 21 87 76 93
     * Hint: Add a One-dimensional array as a data member to the class and store the
     * row
     * numbers starting from 0 to m-1, “m” being the maximum number of rows in the
     * class. Sort
     * the values in this array based on the comparison of the actual values in the
     * specified
     * column in the Matrix. Display the rows in the matrix as per the values in the
     * onedimensional array.
     */
    public void sort() {
        System.out.println("Enter Column Number for sorting");
        int colnum = sc.nextInt();
        int coloumnarr[] = new int[m];
        int ordarr[] = new int[m];
        for (int a = 0; a < m; a++) {
            coloumnarr[a] = M[a][colnum];
            ordarr[a] = a;
        }

        for (int a = 0; a < n; a++) {
            for (int b = a; b < n - 1; b++) {
                if (coloumnarr[b] > coloumnarr[b + 1]) {
                    int temp = coloumnarr[b];
                    coloumnarr[b] = coloumnarr[b + 1];
                    coloumnarr[b + 1] = temp;
                    temp = ordarr[b];
                    ordarr[b] = ordarr[b + 1];
                    ordarr[b + 1] = temp;
                }
            }
        }
        for (int a = 0; a < ordarr.length; a++) {
            int num = ordarr[a];
            for (int b = 0; b < ordarr.length - 1; b++) {
                System.out.print(M[num][b]);
            }
            System.out.println();
        }
    }
}
