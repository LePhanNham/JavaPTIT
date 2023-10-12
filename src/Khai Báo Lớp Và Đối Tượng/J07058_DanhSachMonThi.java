import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class MONHOC implements Comparable<MONHOC> {
    private String ma,ten,hinhthucthi;

    public MONHOC(String ma, String ten, String hinhthucthi) {
        this.ma = ma;
        this.ten = ten;
        this.hinhthucthi = hinhthucthi;
    }

    public int compareTo(MONHOC o1) {
        return this.ma.compareTo(o1.ma);
    }

    public String toString() {
        return this.ma + " " + this.ten + " " + this.hinhthucthi;
    }
}

public class J07058_DanhSachMonThi {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MONHOC.in"));
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<MONHOC> arr = new ArrayList<>();
        while (t-->0) {
            arr.add(new MONHOC(sc.nextLine(),sc.nextLine(),sc.nextLine()));
        }
        Collections.sort(arr);
        for (MONHOC i : arr) {
            System.out.println(i);
        }
    }
}

