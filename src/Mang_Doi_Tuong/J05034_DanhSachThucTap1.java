package Mang_Doi_Tuong;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class SinhVien implements Comparable<SinhVien>{
    private String masv,name,lop,email,dn;
    private int id;

    public SinhVien(int id,String masv, String name, String lop, String email, String dn) {
        this.masv = masv;
        this.id = id;
        this.name = name;
        this.lop = lop;
        this.email = email;
        this.dn = dn;
    }

    public String getDn() {
        return dn;
    }

    public int compareTo(SinhVien o1) {
        return this.name.compareTo(o1.name);
    }
    public String toString() {
        return String.valueOf(id) + " " + masv + " " + name + " " + lop + " " + email + " " + dn;
    }
}
public class J05034_DanhSachThucTap1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        ArrayList<SinhVien> arr = new ArrayList<>();
        for (int i=1;i<=t;i++) {
            String ma = sc.nextLine();
            String name = sc.nextLine();
            String lop = sc.nextLine();
            String email = sc.nextLine();
            String dn = sc.nextLine();
            arr.add(new SinhVien(i,ma,name,lop,email,dn));
        }
        Collections.sort(arr);
        int q = Integer.parseInt(sc.nextLine());
        while (q-->0) {
            String dn2 = sc.nextLine();
            for (SinhVien i : arr) {
                if (i.getDn().equals(dn2)) {
                    System.out.println(i);
                }
            }
        }
    }
}

//6
//B17DCCN016
//Le Khac Tuan Anh
//D17HTTT2
//test1@stu.ptit.edu.vn
//VIETTEL
//B17DCCN107
//Dao Thanh Dat
//D17CNPM5
//test2@stu.ptit.edu.vn
//FPT
//B17DCAT092
//Cao Danh Huy
//D17CQAT04-B
//test3@stu.ptit.edu.vn
//FPT
//B17DCCN388
//Cao Sy Hai Long
//D17CNPM2
//test4@stu.ptit.edu.vn
//VNPT
//B17DCCN461
//Dinh Quang Nghia
//D17CNPM2
//test5@stu.ptit.edu.vn
//FPT
//B17DCCN554
//Bui Xuan Thai
//D17CNPM1
//test6@stu.ptit.edu.vn
//GAMELOFT
//1
//FPT
