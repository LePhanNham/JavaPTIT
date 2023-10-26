import java.util.Scanner;

public class J02023_LuaChonThamLam {
    public static String inMax(int n,int s) {
        int i=0;
        int[] a = new int[n];
        while (i<n) {
            if (s>9) {
                a[i]=9;
                s-=9;
                i++;
            }
            else {
                a[i] = s;
                s = 0;
                i++;
            }
        }
        StringBuilder ss = new StringBuilder();
        for (int j=0;j<n;j++) {
            ss.append(String.valueOf(a[j]));
        }
        return ss.toString();
    }
    public static String inMin(int n,int s) {
        int i=0;
        int[] a = new int[n];
        while (i<n) {
            if (s>9) {
                a[i]=9;
                s-=9;
                i++;
            }
            else if (i==n-1) {
                a[i]=s;
                s=0;
                i++;
            }
            else {
                a[i]=s-1;
                s=1;
                i++;
            }
        }
        StringBuilder ss = new StringBuilder();

        for (int j=n-1;j>=0;j--) {
            ss.append(String.valueOf(a[j]));
        }
        return ss.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int S = sc.nextInt();
        if (n==1 && S==0) System.out.println("0 0");
        else if (S<=0 ||9*n<S) {
            System.out.println("-1 -1");
        }
        else {
            System.out.println(inMin(n,S) + " " + inMax(n,S));
        }
    }
}
