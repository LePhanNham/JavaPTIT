import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
class Sinhvien implements Comparable<Sinhvien> {
    private String ma,ten,lop,email,sdt;

    public Sinhvien(String ma, String ten, String lop, String email, String sdt) {
        this.ma = ma;
        this.ten = ten;
        this.lop = lop;
        this.email = email;
        this.sdt = "0" + sdt;
    }
    public int compareTo(Sinhvien o1) {
        if (this.lop.equals(o1.lop)) {
            return this.ma.compareTo(o1.ma);
        }
        return this.lop.compareTo(o1.lop);
    }
    public String toString() {
        return ma + " " + ten + " " + lop + " " + email + " " + sdt;
    }
}
public class Bai7_DanhSachLienLac {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DANHSACH.in"));
        ArrayList<Sinhvien> arr = new ArrayList<>();
        while (sc.hasNextLine()) {
            arr.add(new Sinhvien(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine()));
        }
        Collections.sort(arr);
        for (Sinhvien i : arr) {
            System.out.println(i);
        }
    }
}
