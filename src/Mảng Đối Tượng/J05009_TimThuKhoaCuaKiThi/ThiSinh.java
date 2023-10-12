package J05009_TimThuKhoaCuaKiThi;

public class ThiSinh implements Comparable<ThiSinh>{
    private String name,ngsinh;
    private double tong;
    private int id;

    public ThiSinh( int id, String name, String ngsinh, double d1, double d2, double d3) {
        this.name = name;
        this.ngsinh = ngsinh;
        this.id = id;
        this.tong = d1+d2+d3;
    }

    public double getTong() {
        return tong;
    }

    public int compareTo(ThiSinh o1) {
        if(this.tong==o1.tong) {
            return this.id-o1.id;
        }
        return this.tong<o1.tong?1:-1;
    }
    public String toString() {
        return String.valueOf(id) + " " + name + " " + ngsinh + " " + tong;
    }
}
