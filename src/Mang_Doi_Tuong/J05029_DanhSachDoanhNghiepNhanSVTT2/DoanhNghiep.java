package Mang_Doi_Tuong.J05029_DanhSachDoanhNghiepNhanSVTT2;

public class DoanhNghiep implements Comparable<DoanhNghiep> {
    private String id,name;
    private int sosv;

    public DoanhNghiep(String id, String name, int sosv) {
        this.id = id;
        this.name = name;
        this.sosv = sosv;
    }

    public int getSosv() {
        return sosv;
    }

    public int compareTo(DoanhNghiep o1) {
        if (this.sosv==o1.sosv) {
            return this.id.compareTo(o1.id);
        }
        return this.sosv<o1.sosv?1:-1;
    }
    public String toString() {
        return id + " "+ name +" " + String.valueOf(sosv);
    }
}
