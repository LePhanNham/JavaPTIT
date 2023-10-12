import java.util.Scanner;

public class J02034_BoSungDaySo {
    public static boolean check(int a[],int n,int k ) {
        for (int i=0;i<n;i++) {
            if (k==a[i]) return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] a = new int[t];
        int xmax=0;
        for (int i=0;i<t;i++) {
            a[i] = sc.nextInt();
            xmax = Math.max(xmax,a[i]);
        }
        int ok = 0;
        for (int i=1;i<=xmax;i++) {
            if (!check(a,t,i)){
                System.out.println(i);
                ok = 1;
            }
        }
        if (ok==0) System.out.println("Excellent!");
    }
}
