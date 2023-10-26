package J05024_LietKeSinhVienTheoNganh;

public class SinhVien {
    private String ma,ten,lop,email,nganh;

    public SinhVien(String ma, String ten, String lop, String email) {
        this.ma = ma;
        this.ten = ten;
        this.lop = lop;
        this.email = email;

    }

    public String getNganh() {
        String s = "";

        if (this.ma.contains("DCKT")) {
            s = "KE TOAN";
        }
        else if (this.ma.contains("DCCN") && !this.lop.substring(0,1).equals("E")) {
            s = "CONG NGHE THONG TIN";
        }
        else if (this.ma.contains("DCAT") && !this.lop.substring(0,1).equals("E")) {
            s = "AN TOAN THONG TIN";
        }
        else if (this.ma.contains("DCVT")) {
            s = "VIEN THONG";
        }
        else if (this.ma.contains("DCDT")){
            s = "DIEN TU";
        }
        return s;
    }

    public String getLop() {
        return this.lop;
    }

    public String toString() {
        return ma + " " + ten + " " + lop + " " + email;
    }
}
