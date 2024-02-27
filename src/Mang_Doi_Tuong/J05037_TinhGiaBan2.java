package Mang_Doi_Tuong;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
class MatHang2 implements Comparable<MatHang2>{
    private String ma,ten,donvi;
    private long phi,thanhtien,giaban;

    public MatHang2(String ma, String ten, String donvi,long dongianhap,long soluong) {
        this.ma = ma;
        this.ten = ten;
        this.donvi = donvi;
        this.phi = Math.round((double)(dongianhap*soluong*0.05));
        this.thanhtien = Math.round((double)(dongianhap*soluong+phi));
        this.giaban = (long) Math.ceil(((double) (this.thanhtien + Math.round((double) (this.thanhtien*2)/100))/(soluong))/100)*100;
    }
    public int compareTo(MatHang2 o1) {
        return this.giaban<o1.giaban?1:-1;
    }
    public String toString() {
        return ma + " " + ten + " " + donvi + " " + phi + " " + thanhtien + " " + giaban;
    }
}
public class J05037_TinhGiaBan2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        ArrayList<MatHang2> arr = new ArrayList<>();
        sc.nextLine();
        for (int i=1;i<=t;i++) {
            String ma = String.format("MH%02d",i);
            String ten = sc.nextLine();
            String donvi = sc.nextLine();
            arr.add(new MatHang2(ma,ten,donvi,Long.parseLong(sc.nextLine()),Long.parseLong(sc.nextLine())));

        }
        Collections.sort(arr);
        for (MatHang2 i : arr) {
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