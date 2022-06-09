package Shapes;

import java.util.Scanner;

abstract class Triangle extends Geoshape {
    Scanner sc = new Scanner(System.in);
    int base;

    Triangle() {
        super();
        System.out.println("Enter base length");
        base = sc.nextInt();
    }

    abstract public void calcarea();

    public void display() {
        System.out.println("Base = " + base);
    }
}