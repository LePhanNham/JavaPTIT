package Mang_Doi_Tuong.J05029_DanhSachDoanhNghiepNhanSVTT2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        ArrayList<DoanhNghiep> arr  = new ArrayList<>();
        while (t-->0) {
            sc.nextLine();
            String id = sc.nextLine();
            String name =sc.nextLine();
            int sosv = sc.nextInt();
            arr.add(new DoanhNghiep(id,name,sosv));
        }
        Collections.sort(arr);
        int q = sc.nextInt();
        while (q-->0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println("DANH SACH DOANH NGHIEP NHAN TU "+String.valueOf(a) +" DEN " + String.valueOf(b) + " SINH VIEN:");
            for (DoanhNghiep i : arr) {
                if (i.getSosv()>=a && i.getSosv()<=b) {
                    System.out.println(i);
                }
                else if (i.getSosv()<a) continue;
            }
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
//1
//30 50