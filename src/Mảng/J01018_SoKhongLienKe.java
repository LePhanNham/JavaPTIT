import java.util.Scanner;

public class J01018_SoKhongLienKe {
    public static boolean checkKC(String s) {

        for (int i=0;i<s.length()-1;i++) {
            if ((int)s.charAt(i+1)-(int)s.charAt(i)!=2 && (int)s.charAt(i+1)-(int)s.charAt(i)!=-2) return false;
        }
        return true;

    }

    public static boolean checkSum(String s){
        int n=0;
        for (int i=0;i<s.length();i++) {
            n+=s.charAt(i)-'0';
        }
        if (n%10==0) return true;
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- >0) {
            String s = sc.next();
            if (checkKC(s) && checkSum(s)) {
                System.out.println("YES");
            }
            else System.out.println("NO");
        }
    }

}
