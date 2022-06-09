
/*
**Question given by GEMS Modern Academy during preparation of ISC / ICSE Board Exams**
Write a program to declare a matrix A [][] of order (MXN) where ‘M’ is the number of rows and ‘N’ is the number of columns such that both M and N must be greater than 2 and less than 20. Allow the user to input integers into this matrix. The program should display the following menu and perform the task based on the user’s choice. The menu should be displayed repeatedly until the users chooses the exit option.
1. Display the input matrix
2. Display the maximum and the minimum value in the matrix and their position.
3. Sort the elements in each row of the matrix, in ascending order and display the matrix.
4. Display the mirror image of the matrix
5. Exit
Example 1. INPUT: 
M=3
N=4
Entered values: 
8,7,9,3,-2,0,4,5,1,3,6,-4
OUTPUT:
Original matrix: 
8  7  9  3
-2 0  4  5
1  3  6 -4
Largest Number: 9
Row: 0
Column: 2
Smallest Number: -4 
Row=2
Column=3 
Rearranged matrix: 
3  7  8  9
-2 0  4  5
1  3  4  6  
Mirror Image: 
9  8  7  3
5  4  0 -2 
6  4  3  1
 */
import java.util.Scanner;

public class MatrixSortandMirror {
    static void bubbleSort(int[] arr) {
        int n = arr.length;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (arr[j - 1] > arr[j]) {
                    // swap elements
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    static void print(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num of rows");
        int M = Math.abs(sc.nextInt());
        System.out.println("Enter num of coloumns");
        int N = Math.abs(sc.nextInt());
        if (M < 2)
            M = 2;
        if (M > 20)
            M = 20;
        if (N < 2)
            N = 2;
        if (N > 20)
            N = 20;
        int A[][] = new int[M][N];
        int copy[][] = new int[M][N];
        copy = A;
        System.out.println("Enter values of matrix");
        // input values of matrix
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                A[i][j] = Math.abs(sc.nextInt());
                copy[i][j] = A[i][j];
            }
        }
        int ch = 1;
        do {
            System.out.println("Menu: \n1. Display the input matrix");
            System.out.println("2. Display the maximum and the minimum value in the matrix and their position.");
            System.out.println(
                    "3. Sort the elements in each row of the matrix, in ascending order and display the matrix. ");
            System.out.println("4. Display the mirror image of the matrix \n5. Exit ");
            ch = sc.nextInt();
            if (ch == 1) {
                print(A);
            } else if (ch == 2) {
                int max = A[0][0];
                int xmax, ymax, xmin, ymin;
                int min = A[0][0];
                xmax = ymax = xmin = ymin = 1;
                for (int i = 0; i < M; i++) {
                    for (int j = 0; j < N; j++) {
                        if (max <= A[i][j]) {
                            max = A[i][j];
                            xmax = i + 1;
                            ymax = j + 1;
                        }
                        if (min >= A[i][j]) {
                            min = A[i][j];
                            xmin = i + 1;
                            ymin = j + 1;
                        }
                    }
                }
                System.out.println("Max= " + max + " in Row " + xmax + " and coloumn " + ymax);
                System.out.println("Min= " + min + " in Row " + xmin + " and coloumn " + ymin);
            } else if (ch == 3) {
                for (int i = 0; i < M; i++) {
                    int temp[] = new int[N];
                    for (int j = 0; j < N; j++)
                        temp[j] = A[i][j];
                    bubbleSort(temp);
                    for (int j = 0; j < N; j++)
                        copy[i][j] = temp[j];
                }
                print(copy);
            } else if (ch == 4) {

                for (int i = 0; i < A.length; i++) {
                    for (int j = A[i].length - 1; j >= 0; j--) {
                        System.out.print(A[i][j] + " ");
                    }
                    System.out.println();
                }
            }
        } while (ch != 5);
    }
}
