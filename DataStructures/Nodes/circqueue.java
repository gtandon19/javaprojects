package Nodes;
class circqueue {
    int arr[], f, r, cap;

    circqueue(int n) {
        cap = n;
        arr = new int[n];
        f = r = 0;
    }

    void add(int x) {
        if (f == r || f == 0 && r == cap) {
            System.out.println("Full");
        } else if (r == cap && f != 0) {
            r = 0;
            arr[r++] = x;
        } else
            arr[r++] = x;
    }

    int remove() {
        if (f == 0 && r == 0) {
            System.out.println("Empty array");
            return 999;
        } else {
            int z = arr[f++];
            if (f == cap)
                f = 0;

            return z;
        }
    }
}