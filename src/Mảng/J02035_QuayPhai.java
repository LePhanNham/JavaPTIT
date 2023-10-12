import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class J02035_QuayPhai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            int n = sc.nextInt();
            long[] a = new long[n];
            long[] arr = new long[n];
            for (int i=0;i<n;i++) {
                a[i]= sc.nextLong();
                arr[i] = a[i];
            }
            Arrays.sort(arr);
            for (int i = 0;i<n;i++) {
                if (a[i]==arr[0]) {
                    System.out.println(i);
                    break;
                }
            }
        }
    }
}
