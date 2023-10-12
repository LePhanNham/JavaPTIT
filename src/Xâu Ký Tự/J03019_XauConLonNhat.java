import java.util.Scanner;

public class J03019_XauConLonNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int max = s.length()-1;
        String res = "";
        for (int i=s.length()-1;i>=0;i--) {
            if (s.charAt(i)>=s.charAt(max)) {
                res = s.charAt(i) + res;
                max = i;
            }
        }
        System.out.println(res);
    }
}
