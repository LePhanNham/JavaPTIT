//
//import java.util.Scanner;
//
//class Point {
//    private double x;
//    private double y;
//
//    Point(double a,double b) {
//        this.x = a;
//        this.y = b;
//    }
//
//    public double getX() {
//        return x;
//    }
//
//    public double getY() {
//        return y;
//    }
//    public double nextPoint(Point a) {
//        double ax = this.x - a.x;
//        double by = this.y - a.y;
//        return Math.sqrt(ax*ax+by*by);
//    }
//
//
//}
//
//class Triangle {
//    Point a1,a2,a3;
//
//    public Triangle(Point a1, Point a2, Point a3) {
//        this.a1 = a1;
//        this.a2 = a2;
//        this.a3 = a3;
//    }
//
//    public boolean valid() {
//        double a = this.a1.nextPoint(this.a2);
//        double b = this.a2.nextPoint(this.a3);
//        double c = this.a1.nextPoint(this.a3);
//        if (Math.max(a,Math.max(b,c))*2>=(a+b+c)) return false;
//        return true;
//    }
//    public String getPerimeter() {
//        double a = this.a1.nextPoint(this.a2);
//        double b = this.a2.nextPoint(this.a3);
//        double c = this.a1.nextPoint(this.a3);
//        double tong = a + b + c;
//        return String.format("%.3f",tong);
//}
//public class J04019_LopTriangle {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int t = sc.nextInt();
//        while(t-- >0){
//            Triangle a = new Triangle(Point.nextPoint(sc), Point.nextPoint(sc), Point.nextPoint(sc));
//            if(!a.valid()){
//                System.out.println("INVALID");
//            } else{
//                System.out.println(a.getPerimeter());
//            }
//        }
//    }
//}
