package Mang_Doi_Tuong;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class SinhVientt implements Comparable<SinhVientt>{
    private String masv,name,lop,email,dn;
    private int id;

    public SinhVientt(int id,String masv, String name, String lop, String email, String dn) {
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

    public int compareTo(SinhVientt o1) {
        return this.masv.compareTo(o1.masv);
    }
    public String toString() {
        return String.valueOf(id) + " " + masv + " " + name + " " + lop + " " + email + " " + dn;
    }
}
public class J05035_DanhSachThucTap2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        ArrayList<SinhVientt> arr = new ArrayList<>();
        for (int i=1;i<=t;i++) {
            String ma = sc.nextLine();
            String name = sc.nextLine();
            String lop = sc.nextLine();
            String email = sc.nextLine();
            String dn = sc.nextLine();
            arr.add(new SinhVientt(i,ma,name,lop,email,dn));
        }
        Collections.sort(arr);
        int q = Integer.parseInt(sc.nextLine());
        while (q-->0) {
            String dn2 = sc.nextLine();
            for (SinhVientt i : arr) {
                if (i.getDn().equals(dn2)) {
                    System.out.println(i);
                }
            }
        }
    }
}