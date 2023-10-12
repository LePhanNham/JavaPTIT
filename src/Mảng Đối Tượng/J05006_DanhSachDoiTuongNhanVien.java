import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class NhanVien implements Comparable<NhanVien>{
    private String ma,name,gender,ngaysinh,diachi,maso,ngaykihd,ngay,thang,nam;

    public NhanVien(String ma,String name, String gender, String ngaysinh, String diachi, String maso, String ngaykihd) {
        this.ma = ma;
        this.name = name;
        this.gender = gender;
        this.ngaysinh = ngaysinh;
        this.diachi = diachi;
        this.maso = maso;
        this.ngaykihd = ngaykihd;
        String ss[] = ngaysinh.split("/");
        this.ngay = ss[0];
        this.thang = ss[1];
        this.nam = ss[2];

    }

    public int compareTo(NhanVien o1) {
        if (this.nam.equals(o1.nam)) {
            if (this.thang.equals(o1.thang)) {
                return this.ngay.compareTo(o1.ngay);
            }
            return this.thang.compareTo(o1.thang);
        }
        return this.nam.compareTo(o1.nam);
    }
    public String toString() {
        return this.ma + " " + this.name + " " + this.gender + " " + this.ngaysinh + " " + this.diachi + " " + this.maso + " " + this.ngaykihd;
    }
}
public class J05006_DanhSachDoiTuongNhanVien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        ArrayList<NhanVien> arr = new ArrayList<>();
        for (int i=1;i<=t;i++) {
            String ma = String.format("%05d",i);
            arr.add(new NhanVien(ma,sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine()));
        }
        Collections.sort(arr);
        for (NhanVien i : arr) {
            System.out.println(i);
        }
    }
}
