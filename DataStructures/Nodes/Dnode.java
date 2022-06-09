package Nodes;

class Dnode {
    Dnode prev, next;
    int x;

    public Dnode(int x) {
        this.x = x;
        prev = next = null;
    }
}