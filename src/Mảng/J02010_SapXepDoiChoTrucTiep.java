import java.util.Scanner;

public class J02010_SapXepDoiChoTrucTiep {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i=0;i<n;i++) {
            a[i]= sc.nextInt();
        }
        int cnt = 1;
        int ok;
        for (int i=0;i<n;i++) {
            ok = 1;

            for (int j=i+1;j<n;j++) {
                if (a[i]>a[j]) {
                    int tmp = a[i];
                    a[i] = a[j];
                    a[j] = tmp;
                    ok = 0;
                }
            }

            if (ok==0) {
                System.out.print("Buoc "+cnt +": ");
                for (int k = 0;k<n;k++) {
                    System.out.print(a[k]+" ");
                }
                System.out.println();
            }
            else break;
            cnt++;
        }
    }
}
