import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class J07008_DayConTangDan {

    public static int a[] = new int[21];
    public static int b[] = new int[21];
    public static Set<String> arr = new TreeSet<>();
    public static void Try(int i,int n) {
        for (int j = 0 ; j<=1 ; j++) {
            b[i] = j;
            if (i==n-1) {
                int res=0;
                String s = "";
                int ok=1;
                int cnt = 0;
                for (int k=0;k<n;k++) {
                    if (b[k]==1 && a[k]>res) {
                        res=a[k];
                        s+=String.valueOf(a[k])+" ";
                        cnt++;
                    }
                }
                if (cnt>=2) {
                    arr.add(s);

                }
//                for(int k=0;k<=n-1;k++) {
//                    System.out.print(b[k]);
//                }
//                System.out.println();
            }
            else {
                Try(i+1,n);
            }
        }
    }
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DAYSO.in"));
        int n = sc.nextInt();
        for (int i=0;i<n;i++) {
            a[i]=sc.nextInt();
//            System.out.println(a[i]);
        }
        Try(0,n);
        for(String s : arr) {
            System.out.println(s);
        }
    }
}
