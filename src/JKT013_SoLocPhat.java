import java.util.*;

public class JKT013_SoLocPhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            int n = sc.nextInt();
            ArrayList<String> arr = new ArrayList<>();
            Queue<String> q = new LinkedList<>();
            arr.add("6");
            arr.add("8");
            q.add("6");
            q.add("8");
            while (q.peek().length()<n) {
                String front = q.poll();
                q.add(front+"6");
                q.add(front+"8");
                arr.add(front+"6");
                arr.add(front+"8");
            }
            System.out.println(arr.size());
            for (int i=arr.size()-1;i>=0;i--) {
                System.out.print(arr.get(i) + " ");
            }
            System.out.println();
        }
    }
}
