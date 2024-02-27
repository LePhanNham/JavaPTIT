import java.util.Scanner;
import java.util.TreeSet;

public class Bai11_XauNhiPhanDoiXungDoDaiChan {
    static int a[] = new int[17];


    public static void Result(int n) {
        for (int i=0;i<n;i++) {
            System.out.print(a[i]);
        }
        for (int i=n-1;i>=0;i--) {
            System.out.print(a[i]);
        }
        System.out.print(" ");
    }
    public static void Try(int i,int n ) {
        for (int j=0;j<=1;j++) {
            a[i]=j;
            if (i==n-1) {
                Result(n);
            }
            else Try(i+1,n);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            int k = sc.nextInt();
            for (int i=1;i<=k/2;i+=1) {
                Try(0,i);
            }
            System.out.println();
        }
    }
}
