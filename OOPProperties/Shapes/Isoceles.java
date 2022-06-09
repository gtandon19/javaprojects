package Shapes;

import java.util.*;

class Isoceles extends Triangle {
    int side;
    Scanner sc = new Scanner(System.in);

    public void accept() {
        System.out.println("Enter the length of the other side besides base");
        side = sc.nextInt();
    }

    public void calcarea() {
        double height;
        height = Math.sqrt((side * side) + ((base / 2) * (base / 2)));
        area = (base * height / 2);
    }

    public void display() {
        System.out.println("The side: " + side);
        System.out.println("Area " + area);
    }
}
