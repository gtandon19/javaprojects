package SchoolSystem;

import java.util.Scanner;

class Student {
    Scanner sc = new Scanner(System.in);
    Scanner sc1 = new Scanner(System.in);
    int grade;
    char sec;
    String name;

    void accept() {
        System.out.println("Enter Name, Grade, Section");
        name = sc1.nextLine();
        grade = sc.nextInt();
        sec = sc.next().charAt(0);
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Grade: " + grade);
        System.out.println("Section: " + sec);
    }

    public static void bubblesort(Student[] x) {
        for (int a = 0; a < x.length; a++) {
            for (int b = a; b < x.length - 1; b++) {
                if (x[b].grade > x[b + 1].grade) {
                    Student temp = x[b];
                    x[b] = x[b + 1];
                    x[b + 1] = temp;
                }
            }
        }
    }

    public static void insertsort(Student[] x) {
        for (int a = 0; a < x.length - 1; a++) {
            // int temp = x[a+1].grade;
            Student tempo = x[a + 1];
            for (int b = a + 1; b > 0; b--) {
                if (x[b].grade < x[b - 1].grade) {
                    x[b] = x[b - 1];
                    x[b - 1] = tempo;
                } else
                    break;
            }
            System.out.println("Status after pass = " + (a + 1));
            for (int d = 0; d < x.length; d++)
                System.out.print(x[d].grade + " ");
            System.out.println();
        }
    }

    public static void selectionsort(Student[] x) {
        for (int a = 0; a < x.length - 1; a++) {
            int temp = a;
            for (int b = a + 1; b < x.length; b++) {
                if (x[b].grade < x[temp].grade) {
                    temp = b;
                }
            }
            Student temp1 = x[a];
            x[a] = x[temp];
            x[temp] = temp1;
            System.out.println("Status after pass = " + (a + 1));
            for (int d = 0; d < x.length; d++)
                System.out.print(x[d].grade + " ");
            System.out.println();
        }
        for (int d = 0; d < x.length; d++)
            System.out.print("Final array: " + x[d].grade + " ");
    }
}
