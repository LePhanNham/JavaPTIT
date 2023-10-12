import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class J03009_TapTuRiengCua2Xau {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-->0)  {
            Set<String> ss2 = new HashSet<>();
            Set<String> ss1 = new HashSet<>();
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();
            String[] s = s1.split(" ");
            String[] s3 = s2.split(" ");
            for (int i = 0;i<s3.length;i++) {
                ss2.add(s3[i]);
            }
            for (int i = 0;i<s.length;i++){
                if (!ss2.contains(s[i]) && !ss1.contains(s[i])) {
                    ss1.add(s[i]);
                }
            }
            for (String i : ss1) {
                System.out.print(i + " ");
            }
            System.out.println();

        }
    }
}
