package Mang_Doi_Tuong.J05028_DanhSachDoanhNghiepNhanSvTT;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        ArrayList<DoanhNghiep> arr = new ArrayList<>();
        while (t-->0) {
            sc.nextLine();
            String ma = sc.nextLine();
            String ten = sc.nextLine();
            int sosv = sc.nextInt();
            arr.add(new DoanhNghiep(ma,ten,sosv));
        }
        Collections.sort(arr);
        for (DoanhNghiep i : arr) {
            System.out.println(i);
        }
    }
}
//4
//VIETTEL
//TAP DOAN VIEN THONG QUAN DOI VIETTEL
//40
//FSOFT
//CONG TY TNHH PHAN MEM FPT - FPT SOFTWARE
//300
//VNPT
//TAP DOAN BUU CHINH VIEN THONG VIET NAM
//200
//SUN
//SUN*
//50