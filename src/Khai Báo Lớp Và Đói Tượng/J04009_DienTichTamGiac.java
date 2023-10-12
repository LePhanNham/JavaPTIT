import java.util.Scanner;


class Triangle2 {
    Point1 a1,a2,a3;

    public Triangle2(Point1 a1, Point1 a2, Point1 a3) {
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
            System.out.printf("%.2f\n",s);
        }
    }
}
public class J04009_DienTichTamGiac {
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
            Point1 d1 = new Point1(x1,y1);
            Point1 d2 = new Point1(x2,y2);
            Point1 d3 = new Point1(x3,y3);
            Triangle2 r = new Triangle2(d1,d2,d3);
            r.cnt();
        }
    }
}
