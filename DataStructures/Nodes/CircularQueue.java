package Nodes;
/* Implementing a circular queue
 */
public class CircularQueue {

    int f, r, A[];

    public CircularQueue(int n) {
        f = r = 0;
        A = new int[n];
    }

    /**
     * Check if f is at 0 and r is at length or
     * if f is not at 0 and f and r are equal.
     * This is because if they are both equal
     * at 0 means it is empty, not full.
     * Then check if r is at the end and f is not at 0. Then move r to front and
     * store.
     */
    public void add(int n) {
        if (f == 0 && r == A.length || f > 0 && f == r) // first time when you add it will say full altho empty
        {
            System.out.println("Full");
        } else if (f > 0 && r == A.length) {
            r = 0; // move r to the front
            A[r++] = n;
        } else
            A[r++] = n;
    }

    /**
     * Store return default value in m.
     * lse store value in m.
     * Then check for 1. if f is at length then move to 0 for circular. 2. f and r
     * are at the same place then move to 0
     */
    public int del() {
        int m = -999;

        if (f == 0 && r == 0) {
            System.out.println("Empty");
            return m;
        } // it then exits if this is true and hence no need for else system

        m = A[f++];

        if (f == A.length)
            f = 0; // move f to 0
        else if (f == r)
            f = r = 0;
        return m;
    }
}
