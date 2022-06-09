package Nodes;
/*
**Question given by GEMS Modern Academy during preparation of ISC / ICSE Board Exams**
Performs a function statement following BODMAS rules employing stack.
 */

import java.util.Scanner;

public class BodmasCalcStack {
    static Stack ob = new Stack();// used to call the object of the class Stack

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String X;
        System.out.println("X");
        X = sc.nextLine();
        System.out.println(toPostfix(X));
    }

    static String toPostfix(String X) {
        char ch;
        String Y = "";
        for (int i = 0; i < X.length(); ++i) {
            ch = X.charAt(i);
            if (Character.isLetter(ch))
                Y = Y + ch;
            else if (ch == '(') {
                ob.push(ch);
            } else if (ch == ')') {
                while (ob.topele() != '(') {
                    Y = Y + ob.pop();
                }
                ob.pop();
            } else {
                while (!ob.isEmpty() && !(ob.topele() == '(') && pr(ch) <= pr(ob.topele()))
                    Y = Y + ob.pop();
                ob.push(ch);
            }
        }
        while (!ob.isEmpty())
            Y = Y + ob.pop();
        return Y;
    }

    static int pr(char x) {// for the precedence of all the possible operations
        if (x == '+' || x == '-')
            return 1;
        if (x == '*' || x == '/' || x == '%')
            return 2;
        return 0;
    }
}

class Stack {
    char arr[] = new char[100];// random size. Maximum taken as 100
    int top = -1;// reference

    void push(char c) {
        if (top == arr.length) {
            System.out.println("FULL");
            System.exit(0);
        } else {
            arr[top + 1] = c;
            top++;
        }
    }

    char pop() {
        return arr[top--];
    }

    boolean isEmpty() {// checking if this is empty
        if (top == -1)
            return true;
        else
            return false;
    }

    char topele() {// to return the top element
        return arr[top];
    }
}