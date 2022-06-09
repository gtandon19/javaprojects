package Nodes;

class Node {
    int x;
    Node next; // self referential structure

    Node(int a) {
        x = a;
        next = null;
    }
}