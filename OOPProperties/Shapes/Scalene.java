package Shapes;

import java.util.*;

public class Scalene extends Triangle {
    int side1, side2;
    Scanner sc = new Scanner(System.in);

    public void accept() {
        System.out.println("Enter the length of the 2 sides besides base");
        side1 = sc.nextInt();
        side2 = sc.nextInt();
    }

    public void calcarea() {
        double s = (base + side1 + side2) / 2; // semiperimeter
        area = Math.sqrt((s) * (s - base) * (s - side1) * (s - side2));
    }

    public void display() {

        System.out.println("Length of both sides= " + side1 + " " + side2);
        System.out.println("Area = " + area);
    }
}