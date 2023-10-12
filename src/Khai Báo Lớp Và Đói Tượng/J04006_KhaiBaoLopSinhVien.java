import java.util.Scanner;

class SinhVienP {
    private String name;
    private String bd;
    private double d1;
    private String lop;
    private String masv = "B20DCCN001";

    public SinhVienP(String name,String lop, String bd, double d1) {
        this.name = name;
        this.lop = lop;
        this.bd = bd;
        this.d1 = d1;

    }


    @Override
    public String toString() {
        return masv + " " +  name + " " + lop + " " +  bd + " " + String.format("%.1f",d1);
    }
}

public class J04006_KhaiBaoLopSinhVien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String lop = sc.nextLine();
        String ns = sc.nextLine();
        double d1 = sc.nextDouble();
        SinhVienP p = new SinhVienP(name,lop,ns,d1);
        System.out.println(p.toString());
    }
}
