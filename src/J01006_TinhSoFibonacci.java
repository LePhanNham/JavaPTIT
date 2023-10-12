
import java.util.Scanner;
public class J01006 {

    static long[] f = new long[100];
    public static void solve() {
        f[1]=f[2]=1;
        for (int i=3;i<93;i++) {
            f[i] = f[i-1] + f[i-2];
        }
    }
    public static void main(String[] args) {
        solve();
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- >0) {
            int n = input.nextInt();
            System.out.println(f[n]);
        }
    }
}
