package Mang_Doi_Tuong.J05027_TimKiemGiangVien;

public class GiangVien {
    private String ma,ten,nganh;


    public GiangVien(String ma, String ten, String nganh) {
        this.ma = ma;
        this.ten = ten;
        String name[] = nganh.trim().split(" ");
        String temp = "";
        for (int i=0;i<name.length;i++) {
            temp += Character.toUpperCase(name[i].charAt(0));
        }
        this.nganh = temp;

    }

    public String getTen() {
        return ten;
    }

    public String toString() {
        return this.ma + " " + this.ten + " " + this.nganh;
    }
}
