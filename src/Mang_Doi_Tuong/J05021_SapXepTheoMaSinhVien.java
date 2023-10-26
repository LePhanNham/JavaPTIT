import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


import java.util.ArrayList;
        import java.util.Collections;
        import java.util.Scanner;

class SINHVIEN implements Comparable<SINHVIEN>{
    private String ma,ten,lop,email;

    public SINHVIEN(String ma, String ten, String lop, String email) {
        this.ma = ma;
        this.ten = ten;
        this.lop = lop;
        this.email = email;
    }

    public int compareTo(SINHVIEN o1) {
        return this.ma.compareTo(o1.ma);
    }

    public String toString() {
        return this.ma + " " + this.ten + " " + this.lop + " " + this.email;
    }
}
public class J05021_SapXepTheoMaSinhVien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<SINHVIEN> arr = new ArrayList<>();
        while (sc.hasNextLine()) {
            arr.add(new SINHVIEN(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine()));
        }
        Collections.sort(arr);
        for (SINHVIEN i : arr) {
            System.out.println(i);
        }
    }
}
