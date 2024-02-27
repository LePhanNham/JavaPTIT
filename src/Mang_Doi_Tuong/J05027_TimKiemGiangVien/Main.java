package Mang_Doi_Tuong.J05027_TimKiemGiangVien;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t =sc.nextInt();
        sc.nextLine();
        ArrayList<GiangVien> arr = new ArrayList<>();
        for (int i=1;i<=t;i++) {
            String ten = sc.nextLine();
            String nganh = sc.nextLine();
            String ma = String.format("GV%02d",i);
            arr.add(new GiangVien(ma,ten,nganh));
        }
        int q = sc.nextInt();
        while(q-->0) {
            String tv = sc.next();
            System.out.println("DANH SACH GIANG VIEN THEO TU KHOA " + tv +":");

            for (GiangVien i : arr) {
                if (i.getTen().toLowerCase().contains(tv.toLowerCase())) {
                    System.out.println(i);
                }
            }
        }
    }
}
