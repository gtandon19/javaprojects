package Nodes;
//Double ended queue
/**
 * R ADDS ELEMENT AND THEN MOVES TO THE NEXT
 * F ADDS AND THEN STAYS AT THE FIRST ELEMENT
 */
class DEQueue {
    int f, r, A[];

    /** Make sure you check for 1. Range and 2. Negative */
    public DEQueue(int n) {
        f = r = 0;
        A = new int[Math.abs(n)];
    }

    /** Check for overflow. If it is at length of array then full. */
    public void addrear(int n) {
        if (r == A.length) // NOT A.length-1!!
            System.out.println("Overflow");
        else
            A[r++] = n;
    }

    /** Check for 1. */
    public void addfront(int n) {
        if (f == 0 && r == 0) // first time adding in the front
        {
            A[f] = n;
            r++;
        } else if (f > 0)
            A[--f] = n;
        else
            System.out.println("Not possible to add from front");
    }

    /**
     * Check if empty. If yes return empty. If no then delete. If it then turns
     * empty then move to 0.
     */
    public int delfront() {
        if (f == r) // was already empty
        {
            System.out.println("Empty");
            return -999;
        }
        int m = A[f++];
        if (f == r) // now gets empty after deleting
            f = r = 0;
        return m;
    }

    /**
     * Check if empty. If yes print. If no then delete from end. If becomes empty
     * then revert to 0
     */
    public int delrear() {
        if (f == r) // if already empty
        {
            System.out.println("Empty");
            return -999;
        }
        int m = A[--r];
        if (f == r) // if becomes empty
            f = r = 0;
        return m;
    }

    public void display() {
        for (int a = f; a < r; a++) {
            System.out.print(A[a]);
        }
    }

    int count() {
        int c;
        if (r > f)
            c = r - f + 1;// total when R>F
        else
            c = f - r + 1;// when F>R
        return c;
    }
}