package J05023_LietKeSinhVienTheoKhoa;

import J05023_LietKeSinhVienTheoKhoa.SinhVien;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        ArrayList<J05023_LietKeSinhVienTheoKhoa.SinhVien> arr = new ArrayList<>();
        while (t-->0) {
            arr.add(new SinhVien(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine()));
        }
        int q = sc.nextInt();
        while (q-->0) {
            int khoa = sc.nextInt();
            System.out.println("DANH SACH SINH VIEN KHOA " + String.valueOf(khoa) + ":");
            int ma = khoa%100;
            for (SinhVien i : arr) {
                if (Integer.parseInt(i.getLop().substring(1,3)) == ma) {
                    System.out.println(i);
                }
            }
        }
    }
}
