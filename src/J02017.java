import java.util.Scanner;
import java.util.Stack;

public class J02017 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        Stack<Integer> st = new Stack<>();
        for (int i = 0;i<t;i++) {
            int a = sc.nextInt();
            if (st.empty()) {
                st.push(a);
            }
            else {
                if ((a+st.peek())%2==0) {
                    st.pop();
                }
                else st.push(a);
            }
        }
        System.out.println(st.size());
    }
}
