import java.util.Scanner;

public class J08012_HinhSao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n+1];
        for (int i=1;i<=n;i++) {
            a[i]=0;
        }
        for (int i=1;i<n;i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            a[x]+=1;
            a[y]+=1;
        }
        for (int i=1;i<=n;i++) {
            if (a[i]==0 || (a[i]!=1 && a[i]!=n-1)) {
                System.out.println("No");
                return;
            }

        }
        System.out.println("Yes");
    }
}
