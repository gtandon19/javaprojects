package Nodes;

import java.util.*;

class ListApplicationMain {
    public static void main() {
        List obj = new List();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter choice from menu below:");
        System.out.println("1. Add at the end");
        System.out.println("2. Add at beginning");
        System.out.println("3. Add sorted node");
        System.out.println("4. Delete from end");
        System.out.println("5. Remove specific node");
        System.out.println("6. Search");
        System.out.println("7. Display");
        System.out.println("8. Sum of even numbers");
        System.out.println("9. Exit");

        int ch;
        do {
            System.out.print("Choice: ");
            ch = sc.nextInt();

            switch (ch) {
                case 9:
                    return;

                case 1:
                    obj.addEnd(sc.nextInt());
                    break;

                case 2:
                    obj.addBegin(sc.nextInt());
                    break;

                case 3:
                    obj.addSort(sc.nextInt());
                    break;

                case 4:
                    obj.delEnd();
                    break;

                case 5:
                    obj.removeSpecific(obj.start, sc.nextInt());
                    break;

                case 6:
                    System.out.println("Position: " + obj.search(sc.nextInt()));
                    break;

                case 7:
                    obj.display();
                    break;

                case 8:
                    if (obj.sumEven(obj.start) != 99)
                        System.out.println("Sum: " + obj.sumEven(obj.start));
                    else
                        System.out.println("Empty");
                    break;

                default:
                    System.out.println("Incorrect");
                    break;

            }
        } while (ch != 0);
    }
}