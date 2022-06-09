
/**

 **Question given by GEMS Modern Academy during preparation of ISC / ICSE Board Exams**


In a computer game, a vertical column and a pile of rings (integers) are displayed. The
objective of the game is to pile up rings on the column in decreasing dimensions till it is
full. While adding a ring, one has to ensure that the dimension of the ring that is to be
added is lesser than that of the previous one. If the one that is added is bigger, then the
previous rings have to be removed and stored in another column. After adding the new
ring, the rings that were removed have to be pushed in. The vertical column can hold 10
rings at the most. Once the column is full, a message has to be flashed “Column
Full…Game Over” and the points earned by the player have to be displayed. Finally the
total points earned must also be displayed.

Hints:
The rings to be added are integers and have to be generated randomly using
math.random().
Use one stack [call it Ring1] to store the column of numbers and another stack [Ring2] to
temporarily hold the numbers. Use the stack class that was created in Term1.
Algorithm for adding a ring to the top of the column.
- Add a new ring, if the column is empty or if it is less than or equal to the top most
ring.
- If the ring to be added is greater than the that of the existing ring(s), then remove
the previous ring(s) from the top of the first column [Ring1] and push it into the
second column[Ring2]. Add the   new ring and then transfer the rings from column2
[Ring2] to column1 [Ring1].
- Once the column is filled to its maximum capacity, display the message “Gameover”
and pop-out the rings from the top of the first column[Ring1], one after
another. Also display the rings (integers) and their sum.
- Display appropriate error message if the user tries to pop out rings, when the
column is empty or when it not yet full.
 */
import java.util.Scanner;

public class TowerofRings {
    public static void main(String[] args) {
        stackdouble obj1 = new stackdouble(10);
        stackdouble obj2 = new stackdouble(10);
        while (true) {
            double y = Math.random() * 100;
            System.out.println(y);
            int cnt = 0;
            // if the stack is empty or the last ring below is bigger
            if (obj1.empty() == true || (obj1.peek() > y && obj1.top < obj1.st.length - 1)) {
                obj1.push(y);
                cnt++;
            } else if (obj1.top == obj1.st.length - 1) {
                obj1.push(y);
                System.out.println("Gameover!");
                cnt++;
            }
            if (obj1.peek() > y) {
                while (y > obj1.peek()) {
                    obj2.push(obj1.pop());

                }
            }
            obj1.push(y);
            cnt++;
            while (obj2.peek() != 9999.999)
                obj1.push(obj2.pop());
            if (cnt == 10) {
                obj1.print();
            }
        }
    }
}

class stackdouble {
    double st[];
    int top;

    stackdouble(int size) {
        st = new double[size];
        top = -1;
    }

    public void push(double n) {
        if (top == st.length - 1)
            System.out.println("Full Stack");
        else
            st[++top] = n;
    }

    public double pop() {
        if (top == -1) {
            return 9999.9999;
        } else {
            double u = st[top--];
            return u;
        }
    }

    public void print() {
        for (int l = 0; l <= 0; l++) {
            System.out.println(st[l]);
        }
    }

    public double peek() {
        if (top == -1) {
            return 9999.9999;
        } else {
            double u = st[top];
            return u;
        }
    }

    public boolean empty() // checks if it is empty
    {
        return top == -1; // returns true if it is -1; false if it is not
    }
}