package Vao_Ra_File;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
class Svien implements Comparable<Svien>{
    private String ma,ten,sdt,email,namess;

    public Svien(String ma, String ten, String sdt, String email) {
        this.ma = ma;
        this.ten = ten;
        this.sdt = sdt;
        this.email = email;
        String ss[] = ten.split("\\s+");

        String name = ss[ss.length-1];
        for (int i=0;i<ss.length-1;i++) {
            name+=" " + ss[i];
        }
        this.namess = name;
    }
    public int compareTo(Svien o1 ){
        if (this.namess.equals(o1.namess)) return this.ma.compareTo(o1.ma);
        return this.namess.compareTo(o1.namess);
    }
    public String toString() {
        return ma + " " + ten + " " + sdt + " " + email;
    }
}
public class J07081_SapXepDanhSachSinhVien {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        int t = sc.nextInt();
        sc.nextLine();
        ArrayList<Svien> arr = new ArrayList<>();
        while (t-->0) {
            arr.add(new Svien(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine()));
        }
        Collections.sort(arr);
        for (Svien i : arr) {
            System.out.println(i);
        }
    }
}
