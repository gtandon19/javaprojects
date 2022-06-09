package Nodes;

class NodeQueue {
    Node front, rear;

    NodeQueue() {
        front = rear = null;
    }

    void add(int y) // add at the end
    {
        Node temp = new Node(y);
        if (rear == null) {
            rear = temp;
            front = temp;
        } else {
            rear.next = temp;
            rear = temp;
        }
    }

    int del() {
        int val = -99999;
        if (front == null) {
            System.out.println("Empty");
            return val;
        }
        val = front.x;
        front = front.next;
        if (front == null) // the one node has been deleted so shift all pointers to null
            rear = null;
        return val;
    }

    void delEnd(Node front, int val) {
        Node last = front;
        if (front.x == val)
            front = front.next;
        else {
            while (last != null) {
                if (last.next.x == val) {
                    last.next = last.next.next;
                    break;
                }
                last = last.next;
            }
        }
    }

    void display() {
        if (front == null) {
            System.out.print("Empty");
            return;
        }
        for (Node pt = front; pt != null; pt = pt.next)
            System.out.print(pt.x + " ");
        System.out.println();
    }
}
