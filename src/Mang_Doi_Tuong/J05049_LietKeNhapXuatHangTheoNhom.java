package Mang_Doi_Tuong;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
class HangHoa implements Comparable<HangHoa> {
    private String ma,nhom;
    private long soluongnhap,soluongxuat,dongia,tien,thue;

    public HangHoa(String ma, long soluongnhap) {
        this.ma = ma;
        this.nhom = nhom;
        this.soluongnhap = soluongnhap;
        if (ma.charAt(0)=='A') {
            this.soluongxuat = Math.round((float) 60* soluongnhap/100);
        }
        else {
            this.soluongxuat = Math.round((float) 70/100 * soluongnhap);
        }
        if (ma.charAt(4)=='Y') {
            this.dongia = 110000;
        }
        else {
            this.dongia = 135000;
        }
        this.tien = soluongxuat*dongia;
        if (ma.charAt(0)=='A' && ma.charAt(4)=='Y') {
            this.thue = this.tien*8/100;
        }
        else if (ma.charAt(0)=='A' && ma.charAt(4)=='N') {
            this.thue = this.tien*11/100;
        }
        else if (ma.charAt(0)=='B' && ma.charAt(4)=='Y') {
            this.thue = this.tien*17/100;
        }
        else {
            this.thue = this.tien*22/100;
        }

    }

    public String getMa() {
        return ma;
    }

    public int compareTo(HangHoa o1) {
        return this.thue<o1.thue?1:-1;
    }
    public String toString() {
        return ma + " " + soluongnhap + " " + soluongxuat + " " + dongia + " " + tien + " " + thue;
    }

}
public class J05049_LietKeNhapXuatHangTheoNhom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        ArrayList<HangHoa> arr = new ArrayList<>();
        while (t-->0) {
            sc.nextLine();
            String ma = sc.nextLine();
            long solgnhap = sc.nextLong();
            arr.add(new HangHoa(ma,solgnhap));
        }
        sc.nextLine();
        String key = sc.nextLine();

        Collections.sort(arr);
        for (HangHoa i : arr) {
            if (i.getMa().substring(0,1).equals(key)) {
                System.out.println(i);
            }
        }
    }
}
//3
//A001Y
//1000
//B012N
//2500
//B003Y
//4582
//B