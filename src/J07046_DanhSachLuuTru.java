import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
class Khach implements Comparable<Khach>{
    private String ma,ten,maphong,ngayden,ngaydi;
    private long tongngay;

    public Khach(String ma, String ten, String maphong, String ngayden[], String ngaydi[]) {
        this.ma = ma;
        this.ten = ten;
        this.maphong = maphong;
        LocalDate ngayDen = LocalDate.of(Integer.parseInt(ngayden[2]),Integer.parseInt(ngayden[1]),Integer.parseInt(ngayden[0]));
        LocalDate ngayDi = LocalDate.of(Integer.parseInt(ngaydi[2]),Integer.parseInt(ngaydi[1]),Integer.parseInt(ngaydi[0]));
        this.tongngay = ChronoUnit.DAYS.between(ngayDen,ngayDi);
    }
    public int compareTo(Khach o1) {
        long l = -(this.tongngay - o1.tongngay);
        return (int)l;
    }
    public String toString() {
        return this.ma + " " + this.ten + " " + this.maphong + " " + this.tongngay;
    }
}
public class J07046_DanhSachLuuTru {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("KHACH.in"));
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<Khach> arr = new ArrayList<>();
        for (int i=1;i<=t;i++) {
            String ma = String.format("KH%02d",i);
            Khach r = new Khach(ma,sc.nextLine(),sc.nextLine(),sc.nextLine().split("/"),sc.nextLine().split("/"));
            arr.add(r);
        }
        Collections.sort(arr);
        for (Khach i : arr) {
            System.out.println(i);
        }
    }
}
