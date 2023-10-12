import java.util.Scanner;

class Rectange {
    private double width;
    private double height;
    private String color;

    Rectange() {
        width = 0;
        height = 0;
        color = "";
    }

    public Rectange(double width, double height, String color) {
        this.width = width;
        this.height = height;
        this.color = color.substring(0,1).toUpperCase() + color.substring(1).toLowerCase();
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public String getColor() {
        return color;
    }

    public double ChuVi() {
        return 2*(width+height);
    }
    public double DienTich() {
        return width*height;
    }

    @Override
    public String toString() {
        return (int)ChuVi() + " " + (int)DienTich() + " " + color;
    }
}

public class J04002_KhaiBaoLopHCN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double width = sc.nextDouble();
        double height = sc.nextDouble();
        String color = sc.next();
        if (width>0 && height>0) {
            Rectange p = new Rectange(width,height,color);
            System.out.println(p.toString());
        }
        else {
            System.out.println("INVALID");
        }
    }
}
