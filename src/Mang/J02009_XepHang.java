import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Pair implements Comparable<Pair> {
    private int truoc,sau;

     Pair(int truoc, int sau) {
        this.truoc = truoc;
        this.sau = sau;
    }

    public int getTruoc() {
        return truoc;
    }

    public int getSau() {
        return sau;
    }

    public int compareTo(Pair o1) {
         return this.truoc-o1.truoc;
    }
}
public class J02009_XepHang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        ArrayList<Pair> arr = new ArrayList<>();
        while (t-->0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            arr.add(new Pair(a,b));
        }
        Collections.sort(arr);
        int sum = 0;
        for (Pair i : arr) {
            if (sum<i.getTruoc()) {
                sum = i.getTruoc();
            }
            sum+=i.getSau();
        }
        System.out.println(sum);
    }
}
