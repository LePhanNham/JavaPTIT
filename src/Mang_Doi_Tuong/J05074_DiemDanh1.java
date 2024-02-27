package Mang_Doi_Tuong;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


class DiemDanh {
    private String ma,ten,lop,diemdanh,xl;

    public DiemDanh(String ma, String ten, String lop) {
        this.ma = ma;
        this.ten = ten;
        this.lop = lop;

    }

    public void setDiemdanh(String diemdanh) {
        this.diemdanh = diemdanh;
    }
    public String Loai() {
        if (Diemcc()==0) {
            return "KDDK";
        }
        return "";
    }
    public String getMa() {
        return ma;
    }

    public int Diemcc() {
        int sum = 10;
        for (int i=0;i<this.diemdanh.length();i++) {
            if (this.diemdanh.charAt(i)=='m') {
                sum-=1;
            }
            else if (this.diemdanh.charAt(i)=='v') {
                sum-=2;
            }
        }
        if (sum<0) sum=0;
        return sum;
    }
    public String toString() {
        return ma + " " + ten + " " + lop + " " + Diemcc() + " " + Loai();
    }
}
public class J05074_DiemDanh1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t =sc.nextInt();
        ArrayList<DiemDanh> arr = new ArrayList<>();
        sc.nextLine();
        for (int i=1;i<=t;i++) {
            String masv = sc.nextLine();
            String name = sc.nextLine();
            String lop = sc.nextLine();
            arr.add(new DiemDanh(masv,name,lop));
        }
        for (int i=1;i<=t;i++) {
            String ma = sc.next();
            String diemdanh = sc.next();
            for (DiemDanh j : arr ) {
                if (j.getMa().equals(ma)) {
                    j.setDiemdanh(diemdanh);
                }
            }
        }
        for (DiemDanh i : arr) {
            System.out.println(i);
        }

    }
}


//3
//B19DCCN999
//Le Cong Minh
//D19CQAT02-B
//B19DCCN998
//Tran Truong Giang
//D19CQAT02-B
//B19DCCN997
//Nguyen Tuan Anh
//D19CQCN04-B
//B19DCCN998 xxxmxmmvmx
//B19DCCN997 xmxmxxxvxx
//B19DCCN999 xvxmxmmvvm