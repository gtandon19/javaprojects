package PointStructure;

public class D2point {
    double x;
    double y;

    D2point(double x1, double y1) {
        x = x1;
        y = y1;
    }

    D2point() {
        x = 0;
        y = 0;
    }

    double distance2d(D2point b) {// calculating distance in 2D space
        double X = b.x;
        double Y = b.y;
        double xdiff = Math.abs(X - x);
        double ydiff = Math.abs(Y - y);
        return (xdiff * xdiff + ydiff * ydiff);
    }
}

class D3point extends D2point {
    double z;

    D3point(double x1, double y1, double z1) {
        super(x1, y1);
        z = z1;
    }

    D3point() {
        z = 0;
    }

    double distance3d(D3point b) {
        // distance in 3D space
        double X = b.x;
        double Y = b.y;
        double Z = b.z;
        double xdiff = Math.abs(X - x);
        double ydiff = Math.abs(Y - y);
        double zdiff = Math.abs(Z - z);
        return (xdiff * xdiff + ydiff * ydiff + zdiff * zdiff);
    }
}