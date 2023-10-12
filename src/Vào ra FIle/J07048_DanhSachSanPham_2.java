import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
class SanPham implements Comparable<SanPham> {
    private String ma,ten;
    private int giaban,baohanh;

    public SanPham(String ma, String ten, int giaban, int baohanh) {
        this.ma = ma;
        this.ten = ten;
        this.giaban = giaban;
        this.baohanh = baohanh;
    }

    public String getTen() {
        return ten;
    }

    public int getGiaban() {
        return giaban;
    }

    public String getMa() {
        return ma;
    }

    public int compareTo(SanPham o1) {
        if (o1.getGiaban()==this.giaban) {
            return this.ma.compareTo(o1.getMa());
        }
        return this.giaban<o1.getGiaban()?1:-1;
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + giaban + " " + baohanh;
    }
}
public class J07048_DanhSachSanPham_2 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("SANPHAM.in"));
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<SanPham> arr = new ArrayList<>();
        while (t-->0) {
            SanPham r = new SanPham(sc.nextLine(),sc.nextLine(),Integer.parseInt(sc.nextLine()),Integer.parseInt(sc.nextLine()));
            arr.add(r);
        }
        Collections.sort(arr);
        for (SanPham i : arr) {
            System.out.println(i);
        }
    }
}
