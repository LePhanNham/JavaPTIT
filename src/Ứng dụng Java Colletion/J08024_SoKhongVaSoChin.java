import java.util.*;

public class J08024_SoKhongVaSoChin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t =sc.nextInt();
        while (t-->0) {
            int n = sc.nextInt();
            ArrayList<String> arr = new ArrayList<>();
            Queue<String> q = new LinkedList<>();
            q.add("9");
            while (true) {
                int top = Integer.parseInt(q.peek());
                if (top%n==0) {
                    System.out.println(top);
                    break;
                }
                String b = q.poll();
                q.add(b+"0");
                q.add(b+"9");
            }
        }
    }
}
