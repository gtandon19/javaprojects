package Shapes;

import java.util.Scanner;

class Rectangle extends Geoshape {
    Scanner sc = new Scanner(System.in);
    int len, breadth;

    Rectangle() {
        super();
        System.out.println("Enter length, then breadth");
        len = sc.nextInt();
        breadth = sc.nextInt();
    }

    public void calcarea() {
        area = len * breadth;
    }

    public void display() {
        System.out.println("Area " + area);
        System.out.println("Rectangle has been displayed");
    }
}