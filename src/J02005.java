import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;

public class J02005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[] a = new int[m];
        int[] b = new int[n];
        int[] dd = new int[1005];
//        Set<Integer> s2 = new HashSet<>();
//        Set<Integer> s = new HashSet<>();
        for (int i=0;i<m;i++) {
            a[i]= sc.nextInt();
//            s.add(a[i]);
            dd[a[i]]=1;
        }
        for (int i=0;i<n;i++) {
            b[i] = sc.nextInt();
//            s2.add(b[i]);

        }
        Arrays.sort(b);
        for (int i = 0 ;i<n ; i++) {
            if (dd[b[i]]==1) {
                System.out.print(b[i] +" ");
                dd[b[i]]=2;
            }
        }
    }

}
