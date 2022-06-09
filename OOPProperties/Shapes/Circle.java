package Shapes;

import java.util.Scanner;

class Circle extends Geoshape {
    Scanner sc = new Scanner(System.in);
    int rad;

    Circle() {
        super();
        System.out.println("Enter radius");
        rad = sc.nextInt();
    }

    public void calcarea() {
        area = (22 / 7.0) * (rad * rad);
    }

    public void display() {
        System.out.println("Area = " + area);
        System.out.println("A circle has been drawn");
    }
}