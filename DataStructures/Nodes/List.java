package Nodes;

class List {
    Node start;
    int len;

    List() {
        start = null;
    }

    void addEnd(int val) // adds to the end
    {
        // CHECK STARTING
        Node temp = new Node(val);
        if (start == null)
            start = temp;
        else {
            Node pt;
            for (pt = start; pt.next != null; pt = pt.next)
                ;
            pt.next = temp;
        }
    }

    void addBegin(int y) {
        // CHECK IF EMPTY
        if (start == null)
            start = new Node(y);
        else {
            Node temp = new Node(y);
            temp.next = start;
            start = temp;
        }
    }

    void addSort(int val) {

        Node temp = new Node(val);
        if (start == null)
            start = temp;
        else {
            Node current = start;
            Node prev = null;
            for (; current != null && current.x < val; prev = current, current = current.next)
                ;

            if (current == null)
                prev.next = temp;

            else if (current == start) {
                temp.next = start;
                start = temp;
            } else {
                prev.next = temp;
                temp.next = current;
            }
        }
    }

    void delEnd() {
        Node pt = start;
        if (start == null) {
            System.out.println("Empty");
            return;
        }
        for (pt = start; pt != null; pt = pt.next) {
            if (pt.next.next == null)
                pt.next = null;
        }
    }

    void removeSpecific(Node start, int val) {
        if (start == null) {
            System.out.println("Empty");
            return;
        }
        Node prev, pt;
        for (pt = start, prev = start; pt != null && pt.x != val; prev = pt, pt = pt.next)
            ;
        if (pt == null)
            System.out.println("Not found");
        else if (pt == start)
            start = start.next;
        else
            prev.next = pt.next;

    }

    int search(int x) {
        Node pt = start;
        int cnt = 1;
        if (start == null) {
            System.out.println("Empty List");
            return 0;
        }
        for (pt = start; pt != null; pt = pt.next, cnt++) {
            if (pt.x == x) {
                return cnt;
            }

        }
        return 0;
    }

    void display() {
        if (start == null) {
            System.out.println("Empty");
            return;
        }
        for (Node pt = start; pt != null; pt = pt.next)
            System.out.println(pt.x);
    }

    int sumEven(Node start) {
        if (start == null)
            return 99;
        int sum = 0;
        for (Node ptr = start; ptr != null; ptr = ptr.next) {
            if (ptr.x % 2 == 0)
                sum += ptr.x;
        }
        return sum;

    }

}
