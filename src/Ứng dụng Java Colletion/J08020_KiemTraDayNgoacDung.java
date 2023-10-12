import java.util.Scanner;
import java.util.Stack;

public class J08020_KiemTraDayNgoacDung {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            String s = sc.next();
            Stack<Character> st = new Stack<>();
            int ok = 1;
            for (int i=0;i<s.length();i++) {
                if (s.charAt(i)=='(' || s.charAt(i)=='[' || s.charAt(i)=='{') {
                    st.push(s.charAt(i));
                }
                else if (s.charAt(i)==')' && st.size()>0 && st.peek()=='(') st.pop();
                else if (s.charAt(i)==']' && st.size()>0 && st.peek()=='[') st.pop();
                else if (s.charAt(i)=='}' && st.size()>0 && st.peek()=='{') st.pop();
                else {
                    ok = 0;
                    break;
                }
            }
            if (ok==0 || st.size()>0) {
                System.out.println("NO");
            }
            else {
                System.out.println("YES");
            }
        }
    }
}
