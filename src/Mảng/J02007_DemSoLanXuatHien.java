import java.util.Scanner;

public class J02007_DemSoLanXuatHien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int cnt = 1;
        while (t-->0) {

            int n = sc.nextInt();
            int[] a = new int[n];
            int[] dd = new int[100005];
            for (int i=0;i<n;i++) {
                a[i] = sc.nextInt();
                dd[a[i]]++;
            }
            System.out.println("Test "+cnt+":");
            for (int i=0;i<n;i++)  {
                if (dd[a[i]]!=0) {
                    System.out.println(a[i]+" xuat hien "+dd[a[i]]+" lan");
                    dd[a[i]]=0;
                }
            }
            cnt++;
        }
    }
}
