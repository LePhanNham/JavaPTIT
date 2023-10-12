import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
class TapDoan implements Comparable<TapDoan> {


    private String ma,ten;
    private int sosv;


    public TapDoan(String ma, String ten, int sosv) {
        this.ma = ma;
        this.ten = ten;
        this.sosv = sosv;
    }

    public String getMa() {
        return ma;
    }

    public int compareTo(TapDoan o1) {
        return ma.compareTo(o1.getMa());
    }

    public String toString() {
        return ma + " " + ten + " " + sosv;
    }
}
public class J07037_DanhSachDoanhNghiep {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DN.in"));
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<TapDoan> arr = new ArrayList<>();
        while (t-->0) {
            TapDoan r = new TapDoan(sc.nextLine(),sc.nextLine(),Integer.parseInt(sc.nextLine()));
            arr.add(r);
        }
        Collections.sort(arr);
        for (TapDoan i : arr) {
            System.out.println(i);
        }
    }
}
