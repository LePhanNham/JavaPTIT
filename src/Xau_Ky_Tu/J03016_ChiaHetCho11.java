import java.math.BigInteger;
import java.util.Scanner;

public class J03016_ChiaHetCho11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            BigInteger a = sc.nextBigInteger();
            if (a.divide(BigInteger.valueOf(11)).multiply(BigInteger.valueOf(11)).equals(a)) System.out.println(1);
            else System.out.println(0);
        }
    }
}
