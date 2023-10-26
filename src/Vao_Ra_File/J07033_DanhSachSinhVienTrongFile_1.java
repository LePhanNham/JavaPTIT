import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class SV implements Comparable<SV> {
    private String ma,ten,lop,email;

    public SV(String ma, String ten, String lop, String email) {
        this.ma = ma;
        this.ten = ten;
        this.lop = lop;
        this.email = email;
    }

    public String getMa() {
        return ma;
    }

    public int compareTo(SV o1) {
        return ma.compareTo(o1.getMa());
    }
    public String toString() {
        return ma + " " + ten + " " + lop + " " + email;
    }
}

public class J07033_DanhSachSinhVienTrongFile_1 {
    public static String ChuanHoa(String s) {
        String[] ss = s.trim().split("\\s+");
        String s2 = "";
        for (int i=0;i<ss.length;i++) {
            s2+=Character.toUpperCase(ss[i].charAt(0));
            for (int j=1;j<ss[i].length();j++) {
                s2+=Character.toLowerCase(ss[i].charAt(j));
            }
            if (i!=ss.length-1) s2+=" ";
        }
        return s2;
    }
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        ArrayList<SV> arr = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        while (t-->0) {
            SV r = new SV(sc.nextLine(),ChuanHoa(sc.nextLine()),sc.nextLine(),sc.nextLine());
            arr.add(r);
        }
        Collections.sort(arr);
        for (SV i : arr) {
            System.out.println(i);
        }
    }
}
