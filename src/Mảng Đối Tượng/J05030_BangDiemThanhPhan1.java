import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class SINHVIENPTIT2 implements Comparable<SINHVIENPTIT2> {
    private String ma,ten,lop;
    private double diem1,diem2,diem3;

    public SINHVIENPTIT2(String ma, String ten, String lop, double diem1, double diem2, double diem3) {
        this.ma = ma;
        this.ten = ten;
        this.lop = lop;
        this.diem1 = diem1;
        this.diem2 = diem2;
        this.diem3 = diem3;
    }

    public int compareTo(SINHVIENPTIT2 o1) {
        return this.ma.compareTo(o1.ma);
    }

    public String toString() {
        return this.ma + " " + this.ten + " " + this.lop + " " + String.valueOf(this.diem1) + " " + String.valueOf(this.diem2) + " " + String.valueOf(this.diem3);
    }
}
public class J05030_BangDiemThanhPhan1 {
    public static void main(String[] args) {
        ArrayList<SINHVIENPTIT2> arr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i=1;i<=t;i++) {
            sc.nextLine();
            arr.add(new SINHVIENPTIT2(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextDouble(),sc.nextDouble(),sc.nextDouble()));
        }
        Collections.sort(arr);
        int cnt = 1;
        for (SINHVIENPTIT2 i : arr) {
            System.out.print(cnt + " ");
            cnt++;
            System.out.println(i);
        }
    }
}
