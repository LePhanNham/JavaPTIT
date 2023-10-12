import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

class SinhVien {
    private String ma,ten,lop;
    private Date ngay;
    private double gpa;

    public SinhVien(String ma, String ten, String lop, String ngay, double gpa) throws ParseException {
        this.ma = ma;
        this.ten = ten;
        this.lop = lop;
        this.ngay = new SimpleDateFormat("dd/MM/yyyy").parse(ngay);
        this.gpa = gpa;
    }

    public String toString() {
        return this.ma + " " + this.ten + " " + this.lop + " " + new SimpleDateFormat("dd/MM/yyyy").format(this.ngay) + " " +String.format("%.2f",this.gpa);
    }
}

public class J07010_DanhSachSinhVienTrongFile {
    public static void main(String[] args) throws FileNotFoundException,ParseException{
        Scanner sc = new Scanner(new File("SV.in"));
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<SinhVien> arr = new ArrayList<>();
        for (int i=1;i<=t;i++) {
            String ma = String.format("B20DCCN%03d",i);
            SinhVien r = new SinhVien(ma,sc.nextLine(),sc.nextLine(),sc.nextLine(),Double.parseDouble(sc.nextLine()));
            arr.add(r);
        }
        for (SinhVien i : arr) {
            System.out.println(i);
        }
    }
}
