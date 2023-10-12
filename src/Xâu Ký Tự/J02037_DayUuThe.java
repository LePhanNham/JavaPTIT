import java.util.ArrayList;
import java.util.Scanner;

public class J02037_DayUuThe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-->0) {
            String ss = sc.nextLine();
            String arr[] = ss.split(" ");

            int demchan =0,demle = 0;
            for (int i=0;i<arr.length;i++) {
                if (Integer.parseInt(arr[i])%2==0) {
                    demchan+=1;

                }
                else {
                    demle+=1;
                }

            }
            if ((arr.length%2==0 && demchan>demle) || (arr.length%2!=0 && demchan<demle)) {
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }
    }
}
