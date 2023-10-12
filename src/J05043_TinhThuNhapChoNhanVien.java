import java.util.ArrayList;
import java.util.Scanner;

class CongNhanVien implements Comparable<CongNhanVien>{
    private String ma,ten,CV;
    private double luongcoban,ngaycong,phucapcv,tamung,conlai,thunhap;

    public CongNhanVien(String ma, String ten, String CV, double luongcoban, double ngaycong) {
        this.ma = ma;
        this.ten = ten;
        this.CV = CV;
        this.ngaycong = ngaycong;
        this.luongcoban = luongcoban * ngaycong;

        if (CV.equals("GD")) {
            this.phucapcv = 500;
        }
        else if (CV.equals("PGD")) {
            this.phucapcv = 400;
        }
        else if (CV.equals("TP")) {
            this.phucapcv = 300;
        }
        else if (CV.equals("KT")) {
            this.phucapcv = 250;
        }
        else {
            this.phucapcv = 100;
        }
        this.thunhap = this.phucapcv+this.luongcoban;
        if ((this.phucapcv+this.luongcoban)*2/3<25000) {
            this.tamung = Math.round(((this.phucapcv+this.luongcoban)*2/3)/1000)*1000;
        }
        else {
            this.tamung = 25000;
        }

        this.conlai = this.luongcoban + this.phucapcv - this.tamung;
    }
    public int compareTo(CongNhanVien o1) {
        return this.thunhap<o1.thunhap?1:-1;
    }

    public String getCV() {
        return CV;
    }

    public String toString() {
        return this.ma + " " + this.ten + " " + String.format("%.0f",this.phucapcv) + " " + String.format("%.0f",this.luongcoban) + " " + String.format("%.0f",this.tamung) + " " + String.format("%.0f",this.conlai);
    }
}
public class J05043_TinhThuNhapChoNhanVien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<CongNhanVien> arr = new ArrayList<>();
        int t = sc.nextInt();
        for (int i=1;i<=t;i++) {
            sc.nextLine();
            String ma = String.format("NV%02d",i);
            String name = sc.nextLine();
            String cv = sc.nextLine();
            double luong = sc.nextDouble();
            double ngay = sc.nextDouble();
            arr.add(new CongNhanVien(ma,name,cv,luong,ngay));
        }
        for (CongNhanVien i : arr) {
            System.out.println(i);
        }
    }
}
//4
//Tran Thi Yen
//NV
//1000
//24
//Nguyen Van Thanh
//BV
//1000
//30
//Doan Truong An
//TP
//3000
//25
//Le Thanh
//GD
//5000
//28