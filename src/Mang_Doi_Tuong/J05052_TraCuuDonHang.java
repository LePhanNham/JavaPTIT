package Mang_Doi_Tuong;

import java.util.ArrayList;
import java.util.Scanner;
class Shop {
    private String ten,ma;
    private long dongia,soluong;

    public Shop(String ten, String ma, long dongia, long soluong) {
        this.ten = ten;
        this.ma = ma;
        this.dongia = dongia;
        this.soluong = soluong;
    }
    public String STTdonhang() {
        return ma.substring(1,4);
    }
    public String MaLoai() {
        return ma.substring(4);
    }
    public long giamgia() {
        if (MaLoai().equals("1")) return dongia*soluong/2;
        else return 3*dongia*soluong/10;
    }
    public long thanhtien() {
        return dongia*soluong-giamgia();
    }
    public String toString() {
        return ten + " " + ma + " " + STTdonhang() + " " + giamgia() + " " + thanhtien();
    }
}
public class J05052_TraCuuDonHang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<Shop> arr = new ArrayList<>();
        while (t-->0) {
            arr.add(new Shop(sc.nextLine(),sc.nextLine(),Long.parseLong(sc.nextLine()),Long.parseLong(sc.nextLine())));
        }
        for (Shop i : arr) {
            System.out.println(i);
        }
    }
}
