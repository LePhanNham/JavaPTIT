package Vao_Ra_File;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
class MonHoc implements Comparable <MonHoc>{
    private String ma,ten,htlythuyet,htthuchnanh;
    private int tinchi;

    public MonHoc(String ma, String ten, int tinchi, String htlythuyet, String htthuchnanh) {
        this.ma = ma;
        this.ten = ten;
        this.htlythuyet = htlythuyet;
        this.htthuchnanh = htthuchnanh;
        this.tinchi = tinchi;
    }
    public int compareTo(MonHoc o1 ) {
        return this.ma.compareTo(o1.ma);
    }

    public String getHtthuchnanh() {
        return htthuchnanh;
    }

    public String toString() {
        return ma + " " +  ten + " " + tinchi + " " + htlythuyet + " " + htthuchnanh;
    }

}
public class J07073_DangkyHinhThucGiangDay {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MONHOC.in"));
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<MonHoc> arr = new ArrayList<>();
        while (t-->0) {
            arr.add(new MonHoc(sc.nextLine(),sc.nextLine(),Integer.parseInt(sc.nextLine()),sc.nextLine(),sc.nextLine()));
        }
        Collections.sort(arr);
        for (MonHoc i : arr) {
            if (!i.getHtthuchnanh().equals("Truc tiep")) {
                System.out.println(i);
            }
        }
    }
}
