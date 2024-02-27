package Mang_Doi_Tuong;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class CuaHang implements Comparable<CuaHang>{
    private String ten,ma,stt,maloai;
    private long dongia,soluong,giamgia,thanhtien;

    public CuaHang(String ten, String ma, long dongia, long soluong) {
        this.ten = ten;
        this.ma = ma;
        this.dongia = dongia;
        this.soluong = soluong;
        this.stt = ma.substring(1,4);
        this.maloai = ma.substring(4);
        if (this.maloai.equals("1")) {
            this.giamgia = Math.round((double) this.dongia*this.soluong/2);
        }
        else {
            this.giamgia = Math.round((double) this.dongia*this.soluong*3/10);
        }
        this.thanhtien = dongia*soluong-giamgia;
    }
    public int compareTo(CuaHang o1) {
        return this.stt.compareTo(o1.stt);
    }
    public String toString() {
        return ten + " " + ma + " " + stt + " " + giamgia + " " + thanhtien;
    }
}

public class J05053_SapXepDonHang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<CuaHang> arr  = new ArrayList<>();
        while (t-->0) {
            arr.add(new CuaHang(sc.nextLine(),sc.nextLine(),Long.parseLong(sc.nextLine()),Long.parseLong(sc.nextLine())));
        }
        Collections.sort(arr);
        for (CuaHang i : arr) {
            System.out.println(i);
        }

    }
}
//3
//Kaki 2
//K0252
//80000
//15
//Jean 1
//J2011
//200000
//24
//Jean 2
//J0982
//150000
//12