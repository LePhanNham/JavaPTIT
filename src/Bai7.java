import java.util.Scanner;

public class Bai7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        String s = sc.nextLine();
//        System.out.println(s.length());
//        s = s.trim();
//        String[] s2 = s.split("\\s+");
//        for (int i = 0;i<s2.length;i++) {
//            System.out.println(s2[i]);
//        }
//        System.out.println(s2.length);
        int sum = 0 ;
        String s3 = sc.next();
        for (int i=0;i<s3.length();i++) {
            if (Character.isDigit(s3.charAt(i))) {
                sum = sum*10+(s3.charAt(i)-'0');
            }
            else {
                if (i>0 && Character.isDigit(s3.charAt(i-1))) {
                    System.out.print(sum+ " ");
                    sum = 0;
                }
            }
        }
        if (sum>0) System.out.println(sum);
    }
}
