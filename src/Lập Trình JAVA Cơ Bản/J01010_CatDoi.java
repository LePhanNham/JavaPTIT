import java.util.Scanner;
public class J01010_CatDoi {
    public static boolean check(String s) {
        int ok=0;
        for (int i=0;i<s.length();i++) {
            if (s.charAt(i)!='0' && s.charAt(i)!='1' && s.charAt(i)!='8' && s.charAt(i)!='9') {
                return false;
            }
            if (s.charAt(i)=='1') ok=1;
        }
        if (ok==0) return false;
        return true;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- >0) {
            String n = sc.next();
            if (check(n)) {
                int dem=0;
                for (int i=0;i<n.length();i++) {

                    if ((n.charAt(i)=='8' || n.charAt(i)=='9'))  {
                        if (i!=dem) {
                            System.out.print('0');
                        }
                        dem++;
                    }
                    else System.out.print(n.charAt(i));
                }
            }
            else {
                System.out.print("INVALID");
            }
            System.out.println();
        }
    }
}
