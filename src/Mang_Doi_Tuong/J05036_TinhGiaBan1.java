package Mang_Doi_Tuong;

import java.util.ArrayList;
import java.util.Scanner;
class MatHang {
    private String ma,ten,donvi;
    private long phi,thanhtien,giaban;

    public MatHang(String ma, String ten, String donvi,long dongianhap,long soluong) {
        this.ma = ma;
        this.ten = ten;
        this.donvi = donvi;
        this.phi = Math.round((double)(dongianhap*soluong*0.05));
        this.thanhtien = Math.round((double)(dongianhap*soluong+phi));
        this.giaban = this.thanhtien + Math.round((double) (this.thanhtien*2)/100);
    }
    public String toString() {
        return ma + " " + ten + " " + donvi + " " + phi + " " + thanhtien + " " + giaban;
    }
}
public class J05036_TinhGiaBan1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        ArrayList<MatHang> arr = new ArrayList<>();
        sc.nextLine();
        for (int i=1;i<=t;i++) {
            String ma = String.format("MH%02d",i);
            String ten = sc.nextLine();
            String donvi = sc.nextLine();
            arr.add(new MatHang(ma,ten,donvi,Long.parseLong(sc.nextLine()),Long.parseLong(sc.nextLine())));

        }
        for (MatHang i : arr) {
            System.out.println(i);
        }
    }
}

//4
//DUONG
//KG
//7500
//150
//TRUNG
//CHUC
//10000
//225
//GAO
//KG
//14000
//118
//SUA
//HOP
//48000
//430