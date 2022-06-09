package Sorting;

class selectionsort {
    public static void main(String[] args) {
        int arr[] = { 3, 6, 1, 9, 5, 2 };

        for (int a = 0; a < arr.length - 1; a++) {
            int temp = a;
            for (int b = a + 1; b < arr.length; b++) {
                if (arr[b] < arr[temp]) {
                    temp = b;
                }
            }
            int temp2 = arr[a];
            arr[a] = arr[temp];
            arr[temp] = temp2;
            System.out.println("After pass " + a);
            for (int x = 0; x < arr.length; x++)
                System.out.print(arr[x]);
        }
        for (int x = 0; x < arr.length; x++)
            System.out.print(arr[x]);

    }
}