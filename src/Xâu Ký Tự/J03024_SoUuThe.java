import java.util.Scanner;

public class J03024_SoUuThe {
    public static int check(String s) {
        if (s.charAt(0)=='0') {
            return 0;
        }
        int demc = 0,deml = 0;
        for (int i=0;i<s.length();i++) {
            if(Character.isAlphabetic(s.charAt(i))) return 0;

            if ((int)s.charAt(i)%2==0) demc++;
            else deml++;
        }
        if ((s.length()%2==0 && demc>deml) || (s.length()%2!=0 && deml>demc)) return 1;
        return 2;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            String s = sc.next();
            if (check(s)==0) {
                System.out.println("INVALID");
            }
            else if (check(s)==1) {
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }
    }
}
