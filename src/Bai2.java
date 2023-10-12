import java.util.Scanner;

public class Bai2 {
    public static boolean check(String s) {
        for (int i=0;i<s.length()/2;i++) {
            if (s.charAt(i)!=s.charAt(s.length()-1-i)) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int n2 = sc.nextInt();
//        int tong = 0;
//        while (n2>0) {
//            tong+=n2%10;
//            n2/=10;
//        }
//        System.out.println(tong);
//        int n =sc.nextInt();
//        int j = 2;
//        while(n > 1) {
//            int dem = 0;
//            while(n%j == 0) {
//                n/=j;
//                dem++;
//            }
//            if(dem > 0) {
//                System.out.printf(" %d(%d) ",j,dem);
//            }
//            j++;
//
//        }
        int n = sc.nextInt();
//        if (check(String.valueOf(n))) {
//            System.out.println(1);
//        }
//        else System.out.println(0);





    }
}
