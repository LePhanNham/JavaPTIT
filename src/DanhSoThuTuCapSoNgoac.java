import java.util.Scanner;
import java.util.Stack;

public class DanhSoThuTuCapSoNgoac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-->0) {
            Stack<Integer> st = new Stack<>();
            int key = 1;
            String s = sc.nextLine();
            for (int i=0;i<s.length();i++) {
                if (s.charAt(i)=='(') {
                    st.push(key);
                    System.out.print(key + " ");
                    key++;
                }
                else if (s.charAt(i)==')') {
                    System.out.print(st.pop() + " ");
                }

            }
            System.out.println();
        }
    }
}
