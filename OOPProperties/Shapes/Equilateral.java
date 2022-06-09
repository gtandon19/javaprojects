package Shapes;

public class Equilateral extends Triangle {
    public void display() {
        System.out.println("Area " + area);
    }

    public void calcarea() {
        area = (Math.sqrt(3) / 4) * base * base;
    }
}
