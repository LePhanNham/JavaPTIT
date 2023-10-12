import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class MatHang implements Comparable<MatHang> {
    private String ma,ten,donvi;
    private int giamua,giaban,loinhuan;

    public MatHang(String ma, String ten, String donvi, int giamua, int giaban) {
        this.ma = ma;
        this.ten = ten;
        this.donvi = donvi;
        this.giamua = giamua;
        this.giaban = giaban;
        this.loinhuan = giaban - giamua;
    }
    public int compareTo(MatHang o1 ) {
        if (this.loinhuan==o1.loinhuan) {
            return this.ma.compareTo(o1.ma);
        }
        return -(this.loinhuan-o1.loinhuan);
    }
    public String toString() {
        return this.ma + " " + this.ten + " " + this.donvi + " " + this.giamua + " " + this.giaban + " " + this.loinhuan;
    }
}

public class J05081_DanhSachMatHang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        ArrayList<MatHang> arr = new ArrayList<>();
        for (int i=1;i<=t;i++) {
            sc.nextLine();
            String ma = String.format("MH%03d",i);
            String ten = sc.nextLine();
            String donvi = sc.nextLine();
            int giamua = sc.nextInt();
            int giaban = sc.nextInt();
            MatHang r = new MatHang(ma,ten,donvi,giamua,giaban);
            arr.add(r);
        }
        Collections.sort(arr);
        for (MatHang i : arr) {
            System.out.println(i);
        }
    }
}
