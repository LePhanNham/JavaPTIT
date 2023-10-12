import java.util.Scanner;

class ThiSinh {
    private String name;
    private String bd;
    private double d1,d2,d3;

    public ThiSinh(String name, String bd, double d1, double d2, double d3) {
        this.name = name;
        this.bd = bd;
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
    }

    public double TongDiem() {
        return this.d1+this.d2+this.d3;
    }

    @Override
    public String toString() {
        return name + " " + bd + " " + String.format("%.1f",TongDiem());
    }
}

public class J04005_KhaiBaoLopThiSinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String ns = sc.nextLine();
        double d1 = sc.nextDouble();
        double d2 = sc.nextDouble();
        double d3 = sc.nextDouble();
        ThiSinh p = new ThiSinh(name,ns,d1,d2,d3);
        System.out.println(p.toString());
    }
}
