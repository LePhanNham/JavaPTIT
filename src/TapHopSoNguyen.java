import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

public class TapHopSoNguyen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        TreeSet<Integer> s1 = new TreeSet<>();
        TreeSet<Integer> s2 = new TreeSet<>();
        for (int i=0;i<m;i++) {
            int x = sc.nextInt();
            s1.add(x);
        }
        for (int i=0;i<n;i++) {
            int x = sc.nextInt();
            s2.add(x);
        }
        TreeSet<Integer> st1 = new TreeSet<>(s1);
        TreeSet<Integer> st2 = new TreeSet<>(s2);
        st1.retainAll(st2);
        for (Integer i : st1) {
            System.out.print(i + " ");

        }
        System.out.println();
        TreeSet<Integer> st3 = new TreeSet<>(s1);
        TreeSet<Integer> st4 = new TreeSet<>(s2);
        for (Integer i : st3) {
            if (!st4.contains(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        TreeSet<Integer> st5 = new TreeSet<>(s1);
        TreeSet<Integer> st6 = new TreeSet<>(s2);
        for (Integer i : st6) {
            if (!st5.contains(i)) {
                System.out.print(i + " ");
            }
        }
    }
}
