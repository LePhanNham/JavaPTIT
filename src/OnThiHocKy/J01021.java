package OnThiHocKy;

import java.util.Scanner;

public class J01021 {
    public static final long p = (long)1e9+7;
    public static long Try(long a,long b) {
        if (b==0) return 1;
        if (b==1) return a;
        long k = Try(a,b/2);
        if (b%2==0) {
            return ((k%p) * (k%p))%p;
        }
        else return ((k*k%p)*(a%p))%p;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            if (a==b && b==0) {
                break;
            }
            System.out.println(Try(a,b));

        }
    }
}
