import java.util.Scanner;

class Point {
    private double x;
    private double y;

    Point(double a,double b) {
        this.x = a;
        this.y = b;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
    public double KC(double x,double y) {
        double ax = this.x - x;
        double by = this.y - y;
        return Math.sqrt(ax*ax+by*by);
    }
}


public class J04001_KhaiBaoLopPoint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            double x1 = sc.nextDouble();
            double y1 = sc.nextDouble();
            double x2 = sc.nextDouble();
            double y2 = sc.nextDouble();
            Point p1 = new Point(x1,y1);
            System.out.printf("%.4f",p1.KC(x2,y2));
            System.out.println();
        }
    }
}
