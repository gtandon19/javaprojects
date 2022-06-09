import java.util.Scanner;

public class Matrix_P3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();// taking the row of the initial matrix
        int M = sc.nextInt();// taking the column of the initial matrix
        int arr[][] = new int[N][M];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                int k = sc.nextInt();// accepting elements of the original matrix
                arr[i][j] = k;
            }
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        } // printing the original matrix.
          // original matrix has been printed.
        int arr2[][] = new int[M][N];
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                arr2[i][j] = arr[j][i];// adding values into the new matrix. The initial matrix has undergone rotation
                                       // by 90 degrees.
            }
        }
        // printing rotated matrix.
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }
    }
}