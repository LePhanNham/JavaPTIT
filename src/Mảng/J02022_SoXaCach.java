import java.util.Scanner;


public class J02022_SoXaCach {

    public static boolean b[] = new boolean[10];
    public static boolean check(String s) {
        for (int i=0;i<s.length()-1;i++) {
            if (Math.abs((s.charAt(i)-'0')-(s.charAt(i+1)-'0'))==1) return false;
        }
        return true;
    }
    public static void Try(String s,int n) {
        if (s.length()==n && check(s)) {
            System.out.println(s);
        }
        else {
            for (int i=1;i<=n;i++) {
                if (b[i]==false) {
                    b[i]=true;
                    Try(s+String.valueOf(i),n);
                    b[i]=false;
                }
            }
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            int n =sc.nextInt();
            for (int i=1;i<=n;i++) {
                b[i]=false;
            }
            Try("",n);
            System.out.println();
        }
    }
}
