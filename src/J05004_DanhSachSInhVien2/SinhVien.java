package J05004_DanhSachSInhVien2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.StringTokenizer;

public class SinhVien {
    private String name;
    private String masv;
    private String lop;
    private Date ngay;
    private double gpa;

    public SinhVien(String name, int masv, String lop, String ngay, double gpa) throws ParseException {
        this.name = ChuanHoa(name);
        this.masv = "B20DCCN" + String.format("%03d",masv);
        this.lop = lop;
        this.ngay = new SimpleDateFormat("dd/MM/yyyy").parse(ngay);
        this.gpa = gpa;
    }
    private String ChuanHoa(String s) {
        StringBuilder kq = new StringBuilder();
        StringTokenizer st = new StringTokenizer(s);
        while(st.hasMoreTokens()) {
            String t = st.nextToken();
            kq.append(Character.toUpperCase(t.charAt(0)));
            for (int i = 1;i<t.length();i++) {
                kq.append(Character.toLowerCase(t.charAt(i)));
            }
            kq.append(" ");
        }
        kq.deleteCharAt(kq.length()-1);
        return kq.toString();
    }

    @Override
    public String toString() {
        return masv + " " + ChuanHoa(name) +  " " + lop + " " + new SimpleDateFormat("dd/MM/yyyy").format(ngay) + " " + String.format("%.2f",gpa);
    }
}
