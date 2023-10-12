import java.util.Scanner;

public class J03025_XauDoiXung {
    public static boolean check(String s) {
        int cnt=0;
        for (int i=0;i<s.length()/2;i++) {
            if (s.charAt(i)!=s.charAt(s.length()-1-i)) {
                cnt+=1;
            }
        }
        if (cnt>1) return false;
        if (cnt==1) return true;
        if (s.length()%2==0) return false;
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            String s = sc.next();
            if (check(s)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
