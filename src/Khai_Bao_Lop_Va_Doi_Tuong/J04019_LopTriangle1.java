package Khai_Bao_Lop_Va_Doi_Tuong;

import java.util.Scanner;

class Point {
    private double x,y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public static Point nextPoint(Scanner sc2) {
        return new Point(sc2.nextDouble(),sc2.nextDouble());
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}
class Triangle {
    private Point a,b,c;

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public boolean valid() {
        double c1 = Math.sqrt((a.getX()-b.getX())*(a.getX()-b.getX()) + (a.getY()-b.getY())*(a.getY()-b.getY()));
        double c2 = Math.sqrt((a.getX()-c.getX())*(a.getX()-c.getX()) + (a.getY()-c.getY())*(a.getY()-c.getY()));
        double c3 = Math.sqrt((b.getX()-c.getX())*(b.getX()-c.getX()) + (b.getY()-c.getY())*(b.getY()-c.getY()));
        if (c1+c2<=c3 || c2+c3 <=c1 || c1 + c3 <= c2) {
            return false;
        }
        else return true;
    }
    public String getPerimeter() {
        double c1 = Math.sqrt((a.getX()-b.getX())*(a.getX()-b.getX()) + (a.getY()-b.getY())*(a.getY()-b.getY()));
        double c2 = Math.sqrt((a.getX()-c.getX())*(a.getX()-c.getX()) + (a.getY()-c.getY())*(a.getY()-c.getY()));
        double c3 = Math.sqrt((b.getX()-c.getX())*(b.getX()-c.getX()) + (b.getY()-c.getY())*(b.getY()-c.getY()));
        return String.format("%.3f",c1+c2+c3);
    }
}
public class J04019_LopTriangle1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            Triangle a = new Triangle(Point.nextPoint(sc), Point.nextPoint(sc), Point.nextPoint(sc));
            if(!a.valid()){
                System.out.println("INVALID");
            } else{
                System.out.println(a.getPerimeter());
            }
        }
    }
}
