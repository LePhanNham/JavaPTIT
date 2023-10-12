import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class baitap2_TongNhoNhat {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DAYSO.in"));
        int t = sc.nextInt();
        while (t-->0) {
            int n = sc.nextInt();
//            String s = sc.nextLine();
////            String[] ss = s.split(" ");
            ArrayList<Integer> arr = new ArrayList<>(n);
            for (int i=0;i<n;i++) {
                arr.add(sc.nextInt());
            }
            Collections.sort(arr);
            long sum1 = 0,sum2 = 0;
            for (int i=0;i<arr.size();i++) {
                if (i%2==0) {
                    sum1 = sum1*10 + arr.get(i);
                }
                else {
                    sum2 = sum2*10+arr.get(i);
                }
            }
            System.out.println(sum1+sum2);
        }
    }
}
