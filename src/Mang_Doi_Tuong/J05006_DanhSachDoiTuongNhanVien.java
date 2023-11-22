package Mang_Doi_Tuong;
import java.util.ArrayList;
import java.util.Scanner;

class NhanVien {
    private String ma,name,gender,ngaysinh,diachi,maso,ngaykihd;

    public NhanVien(String ma,String name, String gender, String ngaysinh, String diachi, String maso, String ngaykihd) {
        this.ma = ma;
        this.name = name;
        this.gender = gender;
        this.ngaysinh = ngaysinh;
        this.diachi = diachi;
        this.maso = maso;
        this.ngaykihd = ngaykihd;
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
        for (NhanVien i : arr) {
            System.out.println(i);
        }
    }
}
