import java.util.Scanner;

public class J01021 {
    public static final long cons = (long)1e9+7;
    public static long mul(long a,long b) {
        if (a==0) return 0;
        if (b==0) return 1;
        if (b==1) return a;
        long k = mul(a,b/2);
        if (b%2==0) return ((k%cons)*(k%cons))%cons;
        else return ((k*k%cons)*a%cons)%cons;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            while (1>0) {
                long a = sc.nextLong();
                long b = sc.nextLong();
                if (a==0 && b == 0) return;
                else {
                    System.out.println(mul(a,b));
                }

            }
    }

}
