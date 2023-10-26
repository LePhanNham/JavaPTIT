import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


class SINHVIENPTIT implements Comparable<SINHVIENPTIT> {
    private String ma,ten,lop;
    private double diem1,diem2,diem3;

    public SINHVIENPTIT(String ma, String ten, String lop, double diem1, double diem2, double diem3) {
        this.ma = ma;
        this.ten = ten;
        this.lop = lop;
        this.diem1 = diem1;
        this.diem2 = diem2;
        this.diem3 = diem3;
    }

    public int compareTo(SINHVIENPTIT o1) {
        return this.ten.compareTo(o1.ten);
    }

    public String toString() {
        return this.ma + " " + this.ten + " " + this.lop + " " + String.valueOf(this.diem1) + " " + String.valueOf(this.diem2) + " " + String.valueOf(this.diem3);
    }
}
public class J05031_BangDiemThanhPhan2 {
    public static void main(String[] args) {
        ArrayList<SINHVIENPTIT> arr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i=1;i<=t;i++) {
            sc.nextLine();
            arr.add(new SINHVIENPTIT(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextDouble(),sc.nextDouble(),sc.nextDouble()));
        }
        Collections.sort(arr);
        int cnt = 1;
        for (SINHVIENPTIT i : arr) {
            System.out.print(cnt + " ");
            cnt++;
            System.out.println(i);
        }
    }
}
