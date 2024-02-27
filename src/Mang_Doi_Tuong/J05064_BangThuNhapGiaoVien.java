package Mang_Doi_Tuong;

import java.util.ArrayList;
import java.util.Scanner;

class GiaoVien {
    private String ma,ten;
    private long luongcoban;

    public GiaoVien(String ma, String ten, long luongcoban) {
        this.ma = ma;
        this.ten = ten;
        this.luongcoban = luongcoban;

    }
    public long phucap() {
        String s = ma.substring(0,2);
        if (s.equals("HT")) return 2000000;
        else if (s.equals("HP")) return 900000;
        return 500000;
    }
    public long hesoluong() {
        return Integer.parseInt(ma.substring(2));
    }

    public String getMa() {
        return ma;
    }

    public long thunhap() {
        return luongcoban*hesoluong()+phucap();
    }
    public String toString() {
        return ma + " " + ten + " " + hesoluong() + " " + phucap() + " " + thunhap();
    }
}
public class J05064_BangThuNhapGiaoVien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        int ht = 0,hp = 0;
        ArrayList<GiaoVien> arr = new ArrayList<>();
        while (t-->0) {
            String ma = sc.nextLine();
            String name = sc.nextLine();
            long lcb = Long.parseLong(sc.nextLine());
            if (ma.substring(0,2).equals("HT")) {
                ht++;
                if (ht<=1) arr.add(new GiaoVien(ma,name,lcb));
            }
            else if (ma.substring(0,2).equals("HP")) {
                hp++;
                if (hp<=2) arr.add(new GiaoVien(ma,name,lcb));
            }
            else arr.add(new GiaoVien(ma,name,lcb));

        }
        for (GiaoVien i : arr) {
            System.out.println(i);
        }
    }
}
//3
//GV01
//Nguyen Kim Loan
//1420000
//HT05
//Hoang Thanh Tuan
//1780000
//GV02
//Tran Binh Nguyen
//1468000