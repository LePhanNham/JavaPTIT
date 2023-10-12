import java.util.Scanner;

public class J02014 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            int[] f = new int[n];
            int sum = 0;
            for (int i=0;i<n;i++) {
                a[i]=sc.nextInt();
                sum+=a[i];
                if (i==0) {
                    f[i]=a[i];
                }
                else {
                    f[i]=f[i-1]+a[i];
                }
            }
            int ok = 0;
            for (int i=1;i<n-1;i++) {
                if (f[i] == sum - f[i-1]) {
                    ok=1;
                    System.out.println(i+1);
                }
            }
            if (ok==0) System.out.println(-1);

        }
    }
}
