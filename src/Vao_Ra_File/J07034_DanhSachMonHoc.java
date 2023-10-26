import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
class MonHoc implements Comparable<MonHoc> {
    private String ma,ten;
    private int tinchi;

    MonHoc(String ma,String ten,int tinchi) {
        this.ma = ma;
        this.ten = ten;
        this.tinchi = tinchi;
    }
    public String getTen() {
        return this.ten;
    }

    public String getMa() {
        return ma;
    }

    public int getTinchi() {
        return tinchi;
    }

    public int compareTo(MonHoc o1) {
        return this.ten.compareTo(o1.getTen());
    }
}
public class J07034_DanhSachMonHoc {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MONHOC.in"));
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<MonHoc> arr = new ArrayList<>();
        while (t-->0) {
            MonHoc r = new MonHoc(sc.nextLine(),sc.nextLine(),Integer.parseInt(sc.nextLine()));
            arr.add(r);
        }
        Collections.sort(arr);
        for (MonHoc i : arr) {
            System.out.println(i.getMa()+ " " + i.getTen() + " " + i.getTinchi());
        }
    }
}
