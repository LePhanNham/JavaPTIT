import java.util.*;

public class baitap1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            String s = sc.next();
            ArrayList<Character> st = new ArrayList<>();
            int sum =0;
            for (int i =0;i<s.length();i++) {
                if (Character.isAlphabetic(s.charAt(i))) {
                    st.add(s.charAt(i));
                }
                else {
                    sum += s.charAt(i)-'0';
                }
            }
            Collections.sort(st);
            for (Character i : st) {
                System.out.print(i);
            }
            System.out.println(sum);
        }
    }
}
