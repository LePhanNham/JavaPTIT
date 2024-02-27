package OnThiHocKy;

import Mang_Doi_Tuong.J05005_DanhSachDoiTuongSinhVien3.SinhVien3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Scanner;

class SinhVien implements Comparable<SinhVien> {
    private String ma,ten,lop;
    private Date ngay;
    private double gpa;

    public SinhVien(String ma, String ten, String lop, String ngay, double gpa) throws ParseException {
        this.ma = ma;
        this.ten = chuanHoa(ten);
        this.lop = lop;
        this.ngay = new SimpleDateFormat("dd/MM/yyyy").parse(ngay);
        this.gpa = gpa;
    }
    public String chuanHoa(String s) {
        String ss[] = s.trim().split("\\s+");
        String name = "";
        for (int i=0;i<ss.length;i++) {
            name+=Character.toUpperCase(ss[i].charAt(0));
            for (int j=1;j<ss[i].length();j++) {
                name +=Character.toLowerCase(ss[i].charAt(j));
            }
            name +=" ";
        }
        return name.trim();
    }
    public int compareTo(SinhVien o1) {
        return this.gpa<o1.gpa?1:-1;
    }
    public String toString() {
        return ma + " " + ten + " " + lop + " " + new SimpleDateFormat("dd/MM/yyyy").format(ngay) + " " + String.format("%.2f",gpa);
    }
}
public class J05005 {
    public static void main(String[] args) throws ParseException{
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        ArrayList<SinhVien> arr = new ArrayList<>();
        for (int i=1;i<=t;i++) {
            String ma = String.format("B20DCCN%03d",i);
            String name = sc.nextLine();
            String lop = sc.nextLine();
            String ngay = sc.nextLine();
            double gpa = Double.parseDouble(sc.nextLine());
            arr.add(new SinhVien(ma,name,lop,ngay,gpa));
        }
        Collections.sort(arr);
        for (SinhVien i : arr) {
            System.out.println(i);
        }
    }
}
//2
//ngUYen Van NaM
//D20DCCN01-B
//2/12/1994
//2.17
//Nguyen QuanG hAi
//D20DCCN02-B
//1/9/1994
//3.0