import java.util.Scanner;

public class J01022 {
    public static long[] f = new long[100];
    public static void solve() {
        f[1]=f[2]=1;
        for (int i=3;i<93;i++ ) {
            f[i] = f[i-1] + f[i-2];
        }
    }
    public static Character ReString(int N,long K) {
        if (N==1) return '0';
        if (N==2) return '1';
        if (K>f[N-2]) return ReString(N-1,K-f[N-2]);
        else return ReString(N-2,K);

    }
    public static void main(String[] args) {
        solve();
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- >0) {
            int n = sc.nextInt();
            long k = sc.nextLong();
            System.out.println(ReString(n,k));

        }
    }
}
