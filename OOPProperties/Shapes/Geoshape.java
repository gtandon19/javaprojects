package Shapes;

import java.util.Scanner;

abstract class Geoshape {
    int x, y; // xy coordinates
    double area;
    String cust_name;
    Scanner sc = new Scanner(System.in);
    Scanner sc1 = new Scanner(System.in);

    Geoshape() {
        System.out.println("Enter name of customer");
        cust_name = sc.nextLine();
        System.out.println("Enter coordinates");
        x = sc1.nextInt();
        y = sc1.nextInt();
    }

    abstract public void calcarea();

    abstract void display();
}