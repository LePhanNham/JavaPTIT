import java.util.Scanner;
import java.util.Stack;

public class J03027 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        Stack<Character> st = new Stack<>();
        String s = sc.next();
        while (1>0) {
            int ok=1;
            for (int i=0;i<s.length()-1;i++) {
                if (s.charAt(i)==s.charAt(i+1)) {
                    s = s.substring(0,i) + s.substring(i+2);
                    ok=0;
                }
            }
            if (ok==1) break;
        }
        if (s.length()>0) System.out.println(s);
        else System.out.println("Empty String");
    }
}
