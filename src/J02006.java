import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class J02006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int a[] = new int[n+m];
        Set<Integer> ss = new TreeSet<>();

        for (int i = 0 ;i<m+n ; i++) {
            a[i] = sc.nextInt();
            ss.add(a[i]);
        }
        for (int x : ss) {
            System.out.print(x+" ");
        }
    }
}
