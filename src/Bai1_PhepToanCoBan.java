import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.*;

public class Bai1_PhepToanCoBan {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DAYSO.in"));
        int t = sc.nextInt();
        ArrayList<BigInteger> s = new ArrayList<>();
        while (t-->0) {
            s.add(sc.nextBigInteger());
        }
        Collections.sort(s);
        BigInteger sum = s.get(0);
        System.out.println(s.get(0));
        System.out.println(s.get(s.size()-1));
        for (int i=1;i<s.size();i++) {
            sum = sum.add(s.get(i));
        }
        System.out.println(sum);
    }
}
