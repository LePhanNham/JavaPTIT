package OnThiHocKy;

import java.math.BigInteger;
import java.util.Scanner;

public class J03012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            BigInteger a1 = sc.nextBigInteger();
            BigInteger a2 = sc.nextBigInteger();
            a1 = a1.add(a2);
            System.out.println(a1);
        }
    }
}
