package Nodes;

//LinearQueue
class LinearQueue {
    int f, r, A[];

    /** Check if 1.Range 2. Negative */
    LinearQueue(int n) {
        f = r = 0;
        A = new int[Math.abs(n)]; // only if its within range
    }

    /** Check if is full by Checking if indicator is at length. */
    public void add(int n) {
        if (r == A.length) // NOT A.length-1!!
            System.out.println("Overflow");
        else
            A[r++] = n;
    }

    /**
     * Check if it is empty. If yes, return underflow.
     * If no, reduce. If it then becomes empty then revert to 0
     */
    public int delete() {
        int m; // to return value
        if (f == r) // it it was already empty
        {
            m = 999;
            System.out.println("Underflow");
        } else
            m = A[f++];
        if (f == r) // if after deleting it becomes empty
            f = r = 0;
        return m;
    }

    public void display() {
        for (int a = 0; a < A.length; a++) {
            System.out.print(A[a]);
        }
    }

}