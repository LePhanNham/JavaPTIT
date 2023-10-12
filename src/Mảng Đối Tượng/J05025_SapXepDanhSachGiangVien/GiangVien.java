package J05025_SapXepDanhSachGiangVien;

public class GiangVien implements Comparable<GiangVien> {
    private String ma,hoten,name,nganh;

    public GiangVien(String ma, String ten, String nganh) {
        this.ma = ma;
        this.hoten = ten;
        this.nganh = "";
        String s[] = nganh.split(" ");
        for (int i=0;i<s.length;i++) {
            this.nganh+=Character.toUpperCase(s[i].charAt(0));
        }
        String ss[] = ten.split(" ");
        this.name = ss[ss.length-1];
    }
    public int compareTo(GiangVien o1) {
        if (this.name.equals(o1.name)) {
            return this.ma.compareTo(o1.ma);
        }
        return this.name.compareTo(o1.name);
    }
    public String toString() {
        return ma + " " + hoten + " " + nganh;
    }
}
