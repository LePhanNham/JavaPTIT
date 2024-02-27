package Mang_Doi_Tuong.J05028_DanhSachDoanhNghiepNhanSvTT;

public class DoanhNghiep implements Comparable<DoanhNghiep> {
    private String id,name;
    private int sosv;

    public DoanhNghiep(String id, String name, int sosv) {
        this.id = id;
        this.name = name;
        this.sosv = sosv;
    }

    public int compareTo(DoanhNghiep o1) {
        if (this.sosv == o1.sosv) {
            return this.id.compareTo(o1.id);
        }
        return this.sosv<o1.sosv?1:-1;
    }
    public String toString() {
        return this.id + " " + this.name +" "+ String.valueOf(this.sosv);
    }
}
