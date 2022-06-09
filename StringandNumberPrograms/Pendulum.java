
/*
 **Question given by GEMS Modern Academy during preparation of ISC / ICSE Board Exams**
  **Question obtained from GeeksforGeeks**
Write a program to input a list of integers in an array and arrange them in a way similar to the to-and-fro movement of a Pendulum.

The minimum element out of the list of integers, must come in center position of array.
The number in the ascending order next to the minimum, goes to the right, the next higher number goes to the left of minimum number and it continues.
As higher numbers are reached, one goes to one side in a to-and-fro manner similar to that of a Pendulum.
 */
import java.util.Scanner;

public class Pendulum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        boolean g[] = new boolean[n];
        for (int i = 0; i < arr.length; i++) {
            int k = sc.nextInt();
            arr[i] = k;// invoke the elements
        }
        for (int i = 0; i < arr.length; i++) {// used to determine the location of the element which is less than zero
            if (arr[i] < 0)
                g[i] = true;
            else
                g[i] = false;
        }
        for (int i = 0; i < arr.length; i++)
            arr[i] = Math.abs(arr[i]);// converting the values into absolute value
        int tmp;
        for (int i = 0; i < arr.length - 1; i++) {// sorting the given array
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
        int arr1[] = new int[n];
        int m = n / 2;
        arr1[m] = (arr[0]);
        int l = m;
        int y = m;
        for (int i = 1; i < arr.length; i++) {
            if (i % 2 != 0) {
                arr1[l + 1] = (arr[i]);
                l++;// this moves to the left of the middle element
            } else {
                arr1[y - 1] = (arr[i]);
                y--;// this moves to the right of the middle element
            }
        }
        for (int i = 0; i < arr1.length; i++) {
            if (g[i] == true)
                System.out.println("-" + arr1[i]);// negative sign remains intact in the given pendulum method
            else
                System.out.println(arr1[i]);// just printing directly if the element in the original array
        }
    }
}