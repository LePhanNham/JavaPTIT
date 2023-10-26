import java.util.Scanner;

class PhanSo {
    private long tu;
    private long mau;
    public PhanSo(long tu,long mau) {
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
    public String ToString() {
        long uoc = gcd(this.tu,this.mau);
        tu/=uoc;
        mau/=uoc;
        return tu + "/" + mau;
    }
}

public class J04003_PhanSo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        PhanSo p = new PhanSo(a,b);
        System.out.println(p.ToString());
    }
}
