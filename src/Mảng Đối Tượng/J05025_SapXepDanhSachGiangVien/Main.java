package J05025_SapXepDanhSachGiangVien;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        ArrayList<J05025_SapXepDanhSachGiangVien.GiangVien> arr = new ArrayList<>();
        for (int i=1;i<=t;i++) {
            String ma = String.format("GV%02d",i);
            arr.add(new J05025_SapXepDanhSachGiangVien.GiangVien(ma,sc.nextLine(),sc.nextLine()));
        }
        Collections.sort(arr);
        for (J05025_SapXepDanhSachGiangVien.GiangVien i : arr) {
            System.out.println(i);
        }
    }
}
//3
//Nguyen Manh Son
//Cong nghe phan mem
//Vu Hoai Nam
//Khoa hoc may tinh
//Dang Minh Tuan
//An toan thong tin
