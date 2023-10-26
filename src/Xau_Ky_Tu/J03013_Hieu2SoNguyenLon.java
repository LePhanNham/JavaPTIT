import java.math.BigInteger;
import java.util.Scanner;

public class J03013_Hieu2SoNguyenLon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            BigInteger X = sc.nextBigInteger();
            int n = X.toString().length();
            BigInteger Y = sc.nextBigInteger();
            int m = Y.toString().length();
            X = X.subtract(Y).abs();
            n = Math.max(n,m);
            int n2 = X.toString().length();
            for (int i =1;i<=n-n2;i++) {
                System.out.print(0);
            }
            System.out.println(X);
        }
    }
}
