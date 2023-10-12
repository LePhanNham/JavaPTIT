import java.util.Scanner;

public class J03032_DaoTu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-->0) {

            String str = sc.nextLine();
            String s[] = str.split(" ");
            for (int i = 0 ;i<s.length;i++) {
                for (int j = s[i].length()-1;j>=0;j--) {
                    System.out.print(s[i].charAt(j));
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }

}
