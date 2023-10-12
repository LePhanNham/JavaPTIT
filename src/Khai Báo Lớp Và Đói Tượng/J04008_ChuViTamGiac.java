import java.util.Scanner;

class Point1 {
    private double x;
    private double y;

    Point1(double a,double b) {
        this.x = a;
        this.y = b;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
    public double KC(Point1 a) {
        double ax = this.x - a.x;
        double by = this.y - a.y;
        return Math.sqrt(ax*ax+by*by);
    }


}

class Triangle {
    Point1 a1,a2,a3;

    public Triangle(Point1 a1, Point1 a2, Point1 a3) {
        this.a1 = a1;
        this.a2 = a2;
        this.a3 = a3;
    }

    public void cnt() {
        double a = this.a1.KC(this.a2);
        double b = this.a2.KC(this.a3);
        double c = this.a1.KC(this.a3);
        if (Math.max(a,Math.max(b,c))*2>=(a+b+c)) System.out.println("INVALID");
        else {
            double tong = a + b + c;
            System.out.printf("%.3f\n",tong);
        }
    }
}
public class J04008_ChuViTamGiac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            double x1 = sc.nextDouble();
            double y1 = sc.nextDouble();
            double x2 = sc.nextDouble();
            double y2 = sc.nextDouble();
            double x3 = sc.nextDouble();
            double y3 = sc.nextDouble();
            Point1 p1 = new Point1(x1,y1);
            Point1 p2 = new Point1(x2,y2);
            Point1 p3 = new Point1(x3,y3);
            Triangle r = new Triangle(p1,p2,p3);
            r.cnt();
        }
    }
}
