package Nodes;

public class LinkD {
    Dnode start, end;

    LinkD() {
        start = end = null;
    }

    public void forwardDisp() {
        if (start == null)
            System.out.println("Empty");
        else {
            for (Dnode pt = start; pt != null; pt = pt.next)
                System.out.println(pt.x + " ");
        }
    }

    public void backwardDisp() {
        if (end == null)
            System.out.println("Empty");
        else {
            for (Dnode pt = end; pt != null; pt = pt.prev)
                System.out.println(pt.x + " ");
        }
    }

    public void addEnd(int val) {
        Dnode temp = new Dnode(val);
        if (end == null)

            start = end = temp;
        else {
            end.next = temp;
            temp.prev = end;
            end = temp;
        }
    }

    public void addBegin(int val) {
        Dnode temp = new Dnode(val);
        if (start == null)
            start = end = temp;
        else {
            start.prev = temp;
            temp.next = start;
            start = temp;
        }
    }

    public void add(int val, int pos) {
        int cnt = 1;
        for (Dnode pt = start; pt != null; pt = pt.next)
            cnt++;
        if (pos > cnt) {
            System.out.println("beyond limits");
            return;
        }
        int numbefore = pos - 1;

        Dnode pt, ptprev;
        int ct = 1;
        Dnode temp = new Dnode(val);
        for (pt = ptprev = start; ct < pos - 1; ptprev = pt, pt = pt.next, ct++)
            ;
        ptprev.next = temp;
        temp.prev = ptprev;
        temp.next = pt;
        pt.prev = temp;
    }
}
