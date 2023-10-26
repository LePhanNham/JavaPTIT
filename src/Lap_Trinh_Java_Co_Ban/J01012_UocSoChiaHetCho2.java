import java.util.Scanner;
public class J01012_UocSoChiaHetCho2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt;
        int t = sc.nextInt();
        while (t-- >0 ) {
            int n = sc.nextInt();
            cnt = 1;
            if (n%2!=0) System.out.println(0);
            else {
                for (int i = 2; i <= Math.sqrt(n); i++) {
                    if (n % i == 0 ) {
                        if (i%2==0) cnt++;
                        if ((n / i) % 2 == 0) cnt++;
                    }
                }
                if ((int)Math.sqrt(n) * (int)Math.sqrt(n) == n) cnt--;
                System.out.println(cnt);
            }
        }
    }

}
