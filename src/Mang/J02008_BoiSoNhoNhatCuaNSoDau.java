import java.util.Scanner;

public class J02008_BoiSoNhoNhatCuaNSoDau {
    public static long gcd(long a,long b) {
        if (b==0) return a;
        return gcd(b,a%b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            long n = sc.nextLong();
            long boi=1;
            for (long i=1;i<=n;i++) {
                boi = boi*i/gcd(boi,i);
            }
            System.out.println(boi);
        }
    }
}
