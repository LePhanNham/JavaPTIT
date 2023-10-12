import java.util.Scanner;

public class J01014 {
    public static Scanner sc = new Scanner(System.in);
    public static boolean ktnt(long n) {
        for (int i=2;i<=Math.sqrt(n);i++) {
            if (n%i==0) return false;
        }
        return n>1;
    }
    public static void TestCase() {
        long n = sc.nextLong();
        long res = 0;
        for (long i=1;i<=Math.sqrt(n);i++) {
            if (n%i==0) {
                if (ktnt(n / i)) {
                    System.out.println(n / i);
                    return;
                }
                if (ktnt(i)) {
                    res = i;
                }
            }

        }
        System.out.println(res);
    }
    public static void main(String[] args) {

        int t = sc.nextInt();
        while(t-->0) {
            TestCase();
        }
    }
}
