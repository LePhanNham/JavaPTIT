import java.util.Scanner;
public class J01007_KiemTraSoFibonacci {
    static long[] f = new long[100];
    public static void solve() {
        f[1] =0;
        f[2] = 1;
        for (int i=3;i<100;i++) {
            f[i] = f[i-1] + f[i-2];
        }
    }
    public static boolean check(long n) {
        for (int i=1;i<100;i++) {
            if (f[i] == n) return true;
            else if (n<f[i]) return false;
        }
        return false;
    }
    public static void main(String[] args) {
        solve();
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- >0) {
            long n = input.nextLong();
            if (check(n)) {
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }
    }
}
