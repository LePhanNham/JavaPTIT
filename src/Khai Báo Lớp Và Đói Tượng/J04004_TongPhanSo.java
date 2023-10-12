import java.util.Scanner;

class PhanSo2 {
    private long tu;
    private long mau;
    public PhanSo2(long tu,long mau) {
        this.tu = tu;
        this.mau = mau;
    }

    private long gcd(long x,long y) {
        while (y!=0) {
            long z = x%y;
            x = y;
            y = z;
        }
        return x;
    }
    public String ToString(PhanSo2 p) {
        long tumoi = this.tu*p.mau+this.mau*p.tu;
        long maumoi = this.mau*p.mau;

        long uoc = gcd(tumoi,maumoi);
        tumoi/=uoc;
        maumoi/=uoc;
        return tumoi + "/" + maumoi;
    }
}

public class J04004_TongPhanSo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long d = sc.nextLong();
        PhanSo2 p = new PhanSo2(a,b);
        PhanSo2 p2 = new PhanSo2(c,d);
        System.out.println(p.ToString(p2));
    }
}
