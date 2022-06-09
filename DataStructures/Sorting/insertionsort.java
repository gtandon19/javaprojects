package Sorting;

class insertionsort {
    public static void main(String[] args) {
        int arr[] = { 2, 4, 7, 2, 9, 6 };
        System.out.println("Array = ");
        for (int a = 0; a < arr.length; a++)
            System.out.print(arr[a] + " ");
        System.out.println();

        for (int a = 0; a < arr.length - 1; a++) {
            int temp = arr[a + 1];
            for (int b = a + 1; b > 0; b--) {
                if (temp < arr[b - 1]) {
                    arr[b] = arr[b - 1];
                    arr[b - 1] = temp;
                } else {
                    break;
                }
            }
            System.out.println("Status after pass = " + (a + 1));
            for (int d = 0; d < arr.length; d++)
                System.out.print(arr[d] + " ");
            System.out.println();
        }
        System.out.println("Array = ");
        for (int a = 0; a < arr.length; a++)
            System.out.print(arr[a] + " ");
    }
}
