import java.util.Scanner;
import java.util.Stack;

public class J08022_PhanTuBenPhaiDauTienLonHon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i=0;i<n;i++) {
                a[i] = sc.nextInt();
            }
            int[] b = new int[n];
            Stack<Integer> st = new Stack<>();
            for (int i=0;i<n;i++) {
                while (st.size()>0 && a[i]>a[st.peek()]) {
                    b[st.peek()] = a[i];
                    st.pop();
                }
                st.push(i);
            }
            while (st.size()>0) {
                b[st.pop()]=-1;
            }
            for (int i =0;i<n;i++) {
                System.out.print(b[i] + " ");
            }
            System.out.println();
        }
    }
}
