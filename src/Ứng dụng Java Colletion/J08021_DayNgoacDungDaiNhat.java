import java.util.Scanner;
import java.util.Stack;

public class J08021_DayNgoacDungDaiNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            String s = sc.next();
            Stack<Integer> st = new Stack<>();
            st.push(-1);
            for (int i=0;i<s.length();i++) {
                if (s.charAt(i)=='(') {
                    st.push(i);
                }
                else if (st.size()>1 && s.charAt(st.peek())=='(') {
                    st.pop();
                }
                else {
                    st.push(i);
                }
            }
            st.push(s.length());
            int xmax=0;
            if (st.size()==2) {
                System.out.println(s.length());
            }

            else {
                while (st.size()>1) {
//                    System.out.println(st.pop());

                    xmax = Math.max(xmax,st.pop()-st.peek()-1);
                }
                System.out.println(xmax);
            }

        }
    }
}
