import java.util.Scanner;
import java.util.Stack;

public class JKT014_DauTuChungKhoan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            Stack<Integer> st = new Stack<>();
            for (int i=0;i<n;i++) {
                a[i] = sc.nextInt();
            }
            for (int i=0;i<n;i++ ){
                while (st.size()>0 && a[i]>=a[st.peek()]) st.pop();
                if (st.size()==0) {
                    System.out.print((i+1) + " ");
                }
                else {
                    System.out.print((i-st.peek()) + " ");
                }
                st.push(i);
            }
            System.out.println();
        }
    }
}
