package Vao_Ra_File;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
class KhachHang implements Comparable<KhachHang> {
    private String ma,ten,loai;
    private long sodau,socuoi,tiendm,tienvdm,vat,tongtien;

    public KhachHang(String ma,String ten, String loai, long sodau, long socuoi) {
        this.ma = ma;
        this.ten = ChuanHoa(ten);
        this.loai = loai;
        this.sodau = sodau;
        this.socuoi = socuoi;
        long sodien = socuoi-sodau;
        long dm;
        if (loai.equals("A")) {
            dm = 100;
        }
        else if (loai.equals("B")) {
            dm = 500;
        }
        else {
            dm = 200;
        }
        if (sodien<dm) {
            this.tiendm = sodien*450;
        }
        else {
            this.tiendm = dm*450;
        }
        if (sodien>dm) {
            this.tienvdm = 1000*(sodien-dm);
        }
        else {
            this.tienvdm = 0;
        }
        this.vat = Math.round(this.tienvdm/20);
        this.tongtien = this.tienvdm+this.tiendm+this.vat;

    }
    private String ChuanHoa(String name) {
        String ss[] = name.trim().split("\\s+");
        String ten = "";
        for (int i=0;i<ss.length;i++) {
            ten+=Character.toUpperCase(ss[i].charAt(0));
            for (int j=1;j<ss[i].length();j++) {
                ten+=Character.toLowerCase(ss[i].charAt(j));
            }
            ten +=" ";
        }
        return ten.trim();
    }
    public int compareTo(KhachHang o1) {
        return this.tongtien<o1.tongtien?1:-1;
    }
    public String toString() {
        return this.ma + " " + this.ten + " " + this.tiendm + " " + this.tienvdm + " " + this.vat + " " + this.tongtien;
    }
}
public class J07056_TinhTienDien {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("KHACHHANG.in"));
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<KhachHang> arr = new ArrayList<>();
        for (int i=1;i<=t;i++) {
            String ma = String.format("KH%02d",i);
            String name = sc.nextLine();

            String loai[] = sc.nextLine().split(" ");
            String kind = loai[0];
            long csd = Long.parseLong((loai[1]));
            long csc = Long.parseLong((loai[2]));
            arr.add(new KhachHang(ma,name,kind,csd,csc));
        }
        Collections.sort(arr);
        for (KhachHang i : arr) {
            System.out.println(i);
        }
    }
}
