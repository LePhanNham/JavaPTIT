import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class J03031_XauDayDu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- >0) {
            String s = sc.next();
            int k = sc.nextInt();
            Set<Character> ss = new HashSet<>();
            for (int i=0;i<s.length();i++) {
                ss.add(s.charAt(i));
            }
            if (ss.size()+k>=26) {
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }
    }
}
