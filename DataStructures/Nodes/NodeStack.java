package Nodes;

class NodeStack {
    Node top;
    int length;

    NodeStack() {
        top = null;
        length = 0;
    }

    void push(int val) {
        if (top == null)
            top = new Node(val);
        else {
            Node temp = new Node(val);
            temp.next = top;
            top = temp;
        }
        length++;
    }

    int pop() {
        if (top == null) {
            System.out.println("Empty");
            return 9999;
        }
        int b = top.x;
        top = top.next;
        length--;
        return b;
    }

    void display() {
        if (top == null) {
            System.out.println("Empty");
            return;
        }
        for (Node pt = top; pt != null; pt = pt.next)
            System.out.print(pt.x + " ");
        System.out.println();
    }
}