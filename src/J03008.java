import java.util.Scanner;

public class J03008 {
    public static boolean ktnt(long n) {
        for (int i=2;i<=Math.sqrt(n);i++) {
            if (n%i==0) return false;
        }
        return n>1;
    }
    public static boolean check(String s) {
        for (int i=0;i<s.length()/2;i++) {
            if (s.charAt(i)!=s.charAt(s.length()-1-i)) return false;
        }
        for (int i=0;i<s.length();i++) {
            if (!ktnt(s.charAt(i)-'0')) return false;
        }
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
