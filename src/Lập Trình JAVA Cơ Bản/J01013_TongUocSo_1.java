import java.util.Scanner;
public class J01013_TongUocSo_1 {
    public static final int N = (int) 2e6;
    public static int[] a = new int[N+5];
    public static void sang() {
        for (int i=2;i*i<=N;i++) {
            if (a[i]==0) {
                for (int j=i;j<=N;j+=i) {
                    if (a[j]==0) a[j]=i;
                }
            }
        }
        for (int i=2;i<=N;i++) {
            if (a[i]==0) a[i]=i;
        }
    }
    public static int cal(int n) {
        if (a[n]==0) return n;
        int sum=0;
        while (n!=1) {
            sum+=a[n];
            n/=a[n];
        }
        return sum;
    }
    public static void main(String[] args) {
        sang();
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        long sum = 0;
        while (t-- >0) {
            int n = sc.nextInt();
            sum+=cal(n);
        }
        System.out.println(sum);

    }
}
