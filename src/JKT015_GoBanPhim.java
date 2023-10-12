import java.util.Scanner;
import java.util.Stack;

public class JKT015_GoBanPhim {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        Stack<Character> st = new Stack<>();
        int index = 0;
        for (int i=0;i<s.length();i++) {
            if (s.charAt(i)=='<') {
                index-=1;
                if (index<0) {
                    index = 0;
                }
            }
            else if (s.charAt(i)=='>' && !st.isEmpty()) {
                index+=1;
            }
            else if (s.charAt(i)=='-') {
                st.remove(index);
            }
            else {
                st.add(index,s.charAt(i));
            }
        }
        String s2 = "";
        while (st.size()>0) {
            s2 += st.pop();
        }
        System.out.println(s2);
    }
}
