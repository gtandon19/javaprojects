package Nodes;

class StackApplicationMain {
    public static void main() {
        NodeStack stk = new NodeStack();
        NodeQueue que = new NodeQueue();
        stk.push(24);
        stk.push(6);
        stk.push(2019);
        stk.pop();
        stk.display();
        que.add(23);
        que.add(23);
        que.add(23);
        que.add(23);
        que.del();
        que.display();
    }
}
