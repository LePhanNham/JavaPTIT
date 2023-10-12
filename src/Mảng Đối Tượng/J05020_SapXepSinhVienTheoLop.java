import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class SINHVIEN1 implements Comparable<SINHVIEN1>{
    private String ma,ten,lop,email;

    public SINHVIEN1(String ma, String ten, String lop, String email) {
        this.ma = ma;
        this.ten = ten;
        this.lop = lop;
        this.email = email;
    }

    public int compareTo(SINHVIEN1 o1) {
        if (this.lop.equals(o1.lop)) {
            return this.ma.compareTo(o1.ma);
        }
        return this.lop.compareTo(o1.lop);
    }

    public String toString() {
        return this.ma + " " + this.ten + " " + this.lop + " " + this.email;
    }
}
public class J05020_SapXepSinhVienTheoLop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<SINHVIEN1> arr = new ArrayList<>();
        int t = sc.nextInt();
        sc.nextLine();
        while (t-->0) {
            arr.add(new SINHVIEN1(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine()));
        }
        Collections.sort(arr);
        for (SINHVIEN1 i : arr) {
            System.out.println(i);
        }
    }
}
