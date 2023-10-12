import java.util.*;

public class baitap4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        HashSet<String> st1 = new HashSet<>();
        for (int i=0;i<n;i++) {
            String s1 = sc.nextLine();
            String[] ss = s1.split(" ");
            for (int j=0;j<ss.length;j++) {
                st1.add(ss[j].toLowerCase());
            }
        }
        List<String> lst1 = new ArrayList<>(st1);
        HashSet<String> st2 = new HashSet<>();
        int m = sc.nextInt();
        sc.nextLine();
        for (int i=0;i<m;i++) {
            String s2 = sc.nextLine();
            String[] ss2 = s2.split(" ");
            for (int j=0;j<ss2.length;j++) {
                st2.add(ss2[j].toLowerCase());
            }
        }
        List<String> lst2 = new ArrayList<>(st2);
        Collections.sort(lst1);
        Collections.sort(lst2);
        for (String sss : lst1) {
            if (!lst2.contains(sss)) {
                System.out.print(sss + " ");
            }
        }
        System.out.println();
        for (String sss : lst2) {
            if (!lst1.contains(sss)) {
                System.out.print(sss + " ");
            }
        }

    }
}
