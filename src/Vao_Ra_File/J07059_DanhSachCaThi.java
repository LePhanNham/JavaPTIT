import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
class CaThi implements Comparable<CaThi> {
    private String ma,ngaythi,giothi,ngay,thang,nam,gio,phut,phongthi;

    public CaThi(String ma, String ngay, String gio, String phongthi) {
        this.ma = ma;
        this.ngaythi = ngay;
        String s1[] = ngay.split("/");
        this.ngay = s1[0];
        this.thang = s1[1];
        this.nam = s1[2];
        this.giothi = gio;
        String s2[] = gio.split(":");
        this.gio = s2[0];
        this.phut = s2[1];
        this.phongthi = phongthi;
    }

    public int compareTo(CaThi o1) {
        if (this.nam.equals(o1.nam)) {
            if (this.thang.equals(o1.thang)) {
                if (this.ngay.equals(o1.ngay)) {
                    if (this.gio.equals(o1.gio)) {
                        return this.phut.compareTo(o1.phut);
                    }
                    return this.gio.compareTo(o1.gio);
                }
                return this.ngay.compareTo(o1.ngay);
            }
            return this.thang.compareTo(o1.thang);
        }
        return this.nam.compareTo(o1.nam);
    }

    public String toString() {
        return this.ma + " " + this.ngaythi + " " + this.giothi + " " + this.phongthi;
    }
}
public class J07059_DanhSachCaThi {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("CATHI.in"));
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<CaThi> arr = new ArrayList<>();
        for (int i=1;i<=t;i++) {
            String ma = String.format("C%03d",i);
            arr.add(new CaThi(ma,sc.nextLine(),sc.nextLine(),sc.nextLine()));
        }
        Collections.sort(arr);
        for (CaThi i : arr) {
            System.out.println(i);
        }
    }
}
