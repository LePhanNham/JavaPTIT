import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class MatHangg implements Comparable<MatHangg>{
    private String ten,nhomhang;
    private int ma;
    private float loinhuan;

    public MatHangg(String ten, String nhomhang, int ma, float giamua, float giaban) {
        this.ten = ten;
        this.nhomhang = nhomhang;
        this.ma = ma;
        this.loinhuan = giaban - giamua;
    }
    public int compareTo(MatHangg o1) {
        return this.loinhuan<o1.loinhuan?1:-1;
    }
    public String toString() {
        return String.valueOf(this.ma) + " " + this.ten + " " + this.nhomhang + " " + String.format("%.2f",this.loinhuan);
    }

}
public class J05010_SapXepDanhSachMatHang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        ArrayList<MatHangg> arr = new ArrayList<>();
        for (int i=1;i<=t;i++) {
            sc.nextLine();
            String ten = sc.nextLine();
            String nhomhang = sc.nextLine();
            float giamua = sc.nextFloat();
            float giaban = sc.nextFloat();
            arr.add(new MatHangg(ten,nhomhang,i,giamua,giaban));
        }
        Collections.sort(arr);
        for (MatHangg i : arr) {
            System.out.println(i);
        }
    }
}
