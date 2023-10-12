import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class MatHang2 implements Comparable<MatHang2> {
    private String ma,ten,nhom;
    private float giamua,giaban,loinhuan;

    public MatHang2(String ma, String ten, String nhom, float giamua, float giaban) {
        this.ma = ma;
        this.ten = ten;
        this.nhom = nhom;
        this.loinhuan = giaban - giamua;
    }

    public int compareTo(MatHang2 o1) {
        return this.loinhuan<o1.loinhuan?1:-1;
    }

    public String toString() {
        return this.ma + " " + this.ten + " " + this.nhom + " " + String.format("%.2f",this.loinhuan);
    }
}
public class J07050_SapXepMatHang {
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<MatHang2> arr = new ArrayList<>();
        Scanner sc = new Scanner(new File("MATHANG.in"));
        int t = Integer.parseInt(sc.nextLine());
        for (int i=1;i<=t;i++) {
            String ma = String.format("MH%02d",i);
            MatHang2 r = new MatHang2(ma,sc.nextLine(),sc.nextLine(),Float.parseFloat(sc.nextLine()),Float.parseFloat(sc.nextLine()));
            arr.add(r);
        }
        Collections.sort(arr);
        for (MatHang2 i : arr) {
            System.out.println(i);
        }
    }
}
