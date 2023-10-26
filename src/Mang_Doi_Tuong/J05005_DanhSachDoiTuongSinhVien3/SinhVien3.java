package Mang_Doi_Tuong.J05005_DanhSachDoiTuongSinhVien3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SinhVien3 implements Comparable<SinhVien3>{
    private String ma,ten,lop;
    private Date ngsinh;
    private double gpa;

    public SinhVien3(String ma, String ten, String lop, String ngsinh, double gpa) throws ParseException {
        this.ma = ma;
        this.ten = ChuanHoa(ten);
        this.lop = lop;
        this.ngsinh = new SimpleDateFormat("dd/MM/yyyy").parse(ngsinh);
        this.gpa = gpa;
    }
    private String ChuanHoa(String s) {
        String ss[] = s.trim().split("\\s+");
        String name = "";
        for (int i=0;i<ss.length;i++) {
            name+=Character.toUpperCase(ss[i].charAt(0));
            for (int j=1;j<ss[i].length();j++) {
                name+=Character.toLowerCase(ss[i].charAt(j));
            }
            if (i!=ss.length-1) {
                name+=" ";
            }
        }
        return name;
    }
    public int compareTo(SinhVien3 o1) {
        return this.gpa<o1.gpa?1:-1;
    }
    public String toString() {
        return ma + " " + ten + " " + lop + " " + new SimpleDateFormat("dd/MM/yyyy").format(ngsinh) + " " + String.format("%.2f",gpa);
    }
}
