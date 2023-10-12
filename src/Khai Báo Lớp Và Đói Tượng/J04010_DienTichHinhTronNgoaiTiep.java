import java.util.Scanner;

class Point2 {
    private double x;
    private double y;

    Point2(double a,double b) {
        this.x = a;
        this.y = b;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
    public double KC(Point2 a) {
        double ax = this.x - a.x;
        double by = this.y - a.y;
        return Math.sqrt(ax*ax+by*by);
    }


}


class Triangle3 {
    Point2 a1,a2,a3;

    public Triangle3(Point2 a1, Point2 a2, Point2 a3) {
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
            double s = Math.sqrt((a+b+c)*(a+b-c)*(a-b+c)*(-a+b+c))/4;
            System.out.printf("%.3f\n",Math.PI*(a*b*c)/(4*s)*(a*b*c)/(4*s));
        }
    }
}
public class J04010_DienTichHinhTronNgoaiTiep {
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
            Point2 d1 = new Point2(x1,y1);
            Point2 d2 = new Point2(x2,y2);
            Point2 d3 = new Point2(x3,y3);
            Triangle3 r = new Triangle3(d1,d2,d3);
            r.cnt();
        }
    }
}
