package J05026_DanhSachGiangVienTheoBoMon;

public class GiangVien {
    private String ma,hoten,name,nganh,major;

    public GiangVien(String ma, String ten, String nganh) {
        this.ma = ma;
        this.hoten = ten;
        this.nganh = "";
        String s[] = nganh.split(" ");
        this.major = nganh.toUpperCase();
        for (int i=0;i<s.length;i++) {
            this.nganh+=Character.toUpperCase(s[i].charAt(0));
        }
        String ss[] = ten.split(" ");
        this.name = ss[ss.length-1];
    }

    public String getNganh() {
        return nganh;
    }

    public String toString() {
        return ma + " " + hoten + " " + nganh;
    }
}
