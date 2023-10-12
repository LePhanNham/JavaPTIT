import java.util.Scanner;


public class J01011_BoiSoChungUocSoChung {

        public static long check(long a,long b) {
            if(b == 0) return a;
            return check(b,a%b);
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0) {
                long a = sc.nextLong();
                long b = sc.nextLong();
                long uc = check(a,b);
                long bc = (a*b)/(uc);
                System.out.print(bc);
                System.out.println(" " + uc);
            }

        }
}
