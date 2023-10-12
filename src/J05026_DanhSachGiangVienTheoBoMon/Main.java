package J05026_DanhSachGiangVienTheoBoMon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        ArrayList<GiangVien> arr = new ArrayList<>();
        for (int i=1;i<=t;i++) {
            String ma = String.format("GV%02d",i);
            arr.add(new GiangVien(ma,sc.nextLine(),sc.nextLine()));
        }
        int q = sc.nextInt();
        sc.nextLine();
        while (q-->0) {
            String nganh = sc.nextLine().toUpperCase();
            String ss[] = nganh.split(" ");
            String s = "";
            for (int i=0;i<ss.length;i++) {
                s+=ss[i].charAt(0);
            }
            System.out.println("DANH SACH GIANG VIEN BO MON " + s + ":");
            for (GiangVien i : arr) {
                if (i.getNganh().equalsIgnoreCase(s)) {
                    System.out.println(i);
                }
            }

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
//1
//Cong nghe phan mem