package J05003_DanhSachDoiTuongSinhVien;

import java.lang.String;
import java.text.SimpleDateFormat;
import java.util.StringTokenizer;
import java.text.ParseException;
import java.util.*;
import java.text.*;
public class SinhVien {
    private String name;
    private String masv;
    private String lop;
    private Date ngay;
    private double gpa;

    public SinhVien(String name, int masv, String lop, String ngay, double gpa) throws ParseException {
        this.name = name;
        this.masv = "B20DCCN" + String.format("%03d",masv);
        this.lop = lop;
        this.ngay = new SimpleDateFormat("dd/MM/yyyy").parse(ngay);
        this.gpa = gpa;
    }
//    private StringBuilder ChuanHoa(String s) {
//        StringBuilder kq = new StringBuilder();
//        StringTokenizer st = new StringTokenizer(s);
//        while(st.hasMoreTokens()) {
//            String t = st.nextToken();
//            kq.append(Character.toUpperCase(t.charAt(0)));
//            for (int i = 1;i<t.length();i++) {
//                kq.append(Character.toUpperCase(t.charAt(i)));
//            }
//            kq.append(" ");
//        }
//        kq.deleteCharAt(kq.length()-1);
//        return kq;
//    }

    @Override
    public String toString() {
        return masv + " " + name +  " " + lop + " " + new SimpleDateFormat("dd/MM/yyyy").format(ngay) + " " + String.format("%.2f",gpa);
    }
}

