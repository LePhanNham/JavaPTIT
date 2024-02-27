package Mang_Doi_Tuong;

import java.util.ArrayList;
import java.util.Scanner;

class XangDau {
    private String madonhang;
    private long soluong;
    private double thue;

    public XangDau(String madonhang, long soluong) {
        this.madonhang = madonhang;
        this.soluong = soluong;
    }
    public String tenHang() {
        String s = madonhang.substring(3);
        if (s.equals("TN")) {
            return "Trong Nuoc";
        }
        else if (s.equals("BP")) {
            return "British Petro";
        }
        else if (s.equals("ES")) {
            return "Esso";
        }
        else if (s.equals("SH")) {
            return "Shell";
        }
        else if (s.equals("CA")) {
            return "Castrol";
        }
        else return "Mobil";
    }
    public long dongia(){
        String s = madonhang.substring(0,1);
        if (s.equals("X")) {
            return 128000;
        }
        else if(s.equals("D")) {
            return 11200;
        }
        else return 9700;
    }

    public double thue() {
        String s1 = madonhang.substring(0,1);
        String s2 = madonhang.substring(3);
        if (s2.equals("TN")) {
            return 0;
        }
        else {
            if (s1.equals("X")) return 0.03*dongia()*soluong;
            else if (s1.equals("D")) return 0.035*dongia()*soluong;
            else return 0.02*dongia()*soluong;
        }

    }
    public long thanhtien() {
        return (long)(thue()+dongia()*soluong);
    }
    public String toString() {
        return madonhang + " " + tenHang() + " " + dongia() + " " + (long)thue() + " " + thanhtien();
    }
}
public class J05067_QuanLyKhoXangDau {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<XangDau> arr = new ArrayList<>();
        while (t-->0) {
            arr.add(new XangDau(sc.next(),Long.parseLong(sc.next())));
        }
        for (XangDau i : arr) {
            System.out.println(i);
        }
    }
}
//3
//N89BP 4500
//D00BP 3500
//X92SH 2600