package Mang_Doi_Tuong;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;



class NhanVien3 implements Comparable<NhanVien3> {
    private String id,name,chucvu;
    private long luongngay,songay,luong,thuong,phucap,thuclinh;



    public NhanVien3(String id, String name, long luongngay, long songay, String chucvu) {
        this.id = id;
        this.name = name;
        this.luongngay = luongngay;
        this.songay = songay;
        this.chucvu = chucvu;
        this.luong = this.luongngay * this.songay;
        if (songay >=25) {
            this.thuong =  (long)(luong/5);
        }
        else if (songay >=22) {
            this.thuong = (long) (luong)/10;
        }
        else {
            this.thuong =  0;
        }
        this.phucap = 0;
        if (chucvu.equals("GD")) this.phucap = 250000;
        else if (chucvu.equals("PGD")) this.phucap = 200000;
        else if (chucvu.equals("TP")) this.phucap = 180000;
        else if (chucvu.equals("NV")) this.phucap = 150000;
        this.thuclinh = this.luong + this.phucap + this.thuong;
    }
    public int compareTo(NhanVien3 o1) {
        return this.thuclinh<o1.thuclinh?1:-1;
    }
    public long getThuclinh() {
        return thuclinh;
    }
    public String toString() {
        return id +  " " + name + " " + luong +  " " + thuong + " " + phucap + " " +  thuclinh;
    }
}
public class J05041_SapXepBangTinhCong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<NhanVien3> arr = new ArrayList<>();
        for (int i=1;i<=t;i++ ) {
            arr.add(new NhanVien3(String.format("NV%02d",i),sc.nextLine(),Long.parseLong(sc.nextLine()),Long.parseLong(sc.nextLine()),sc.nextLine()));
        }
        Collections.sort(arr);
        for (NhanVien3 i : arr) {
            System.out.println(i);
        }

    }
}
//5
//Cao Van Vu
//50000
//26
//GD
//Bui Thi Trang
//45000
//23
//PGD
//Do Van Truong
//40000
//25
//PGD
//Nguyen Van Cam
//37000
//26
//TP
//Truong Thi Tu Linh
//45000
//22
//NV

//3
//Cao Van Vu
//50000
//26
//GD
//Do Van Truong
//40000
//25
//PGD
//Truong Thi Tu Linh
//45000
//22
//NV