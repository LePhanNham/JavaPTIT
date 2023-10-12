import java.util.Scanner;

public class J03040_BienSoDep {
    public static boolean checkTang(String s) {
        if (s.charAt(5)>=s.charAt(6) || s.charAt(6)>=s.charAt(7) || s.charAt(7)>=s.charAt(9) || s.charAt(9)>=s.charAt(10)) return false;
        return true;
    }
    public static boolean checkBN(String s) {
        if (s.charAt(5)!=s.charAt(6) || s.charAt(6)!=s.charAt(7) || s.charAt(7)!=s.charAt(9) || s.charAt(9)!=s.charAt(10)) return false;
        return true;
    }
    public static boolean checkDC(String s) {
        if (s.charAt(5) == s.charAt(6) && s.charAt(6)==s.charAt(7) && s.charAt(9)==s.charAt(10)) return true;
        return false;
    }
    public static boolean checkLP(String s) {
        if ((s.charAt(5)!='6' && s.charAt(5)!='8') || (s.charAt(6)!='6' && s.charAt(6)!='8') || (s.charAt(7)!='6' && s.charAt(7)!='8') || (s.charAt(9)!='6' && s.charAt(9)!='8') || (s.charAt(10)!='6' && s.charAt(10)!='8')) return false;
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            String s = sc.next();
            if (checkBN(s) || checkLP(s) || checkDC(s) || checkTang(s)) {
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }
    }

}
