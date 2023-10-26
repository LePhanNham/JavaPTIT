import java.util.Scanner;

public class J03005_ChuanHoaXauHoTen2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.next());
        sc.nextLine();
        while (t-->0) {
            String name = sc.nextLine();
            name = name.trim();
            String s[] = name.split("\\s+");
            StringBuilder xau = new StringBuilder();
            for (int i=1;i<s.length;i++) {
                s[i] = s[i].trim();
                xau.append(Character.toUpperCase(s[i].charAt(0)));
                for (int j=1;j<s[i].length();j++) {
                    xau.append(Character.toLowerCase(s[i].charAt(j)));
                }
                if (i!=s.length-1) xau.append(" ");
                else xau.append(", ");
            }
            for (int j=0;j<s[0].length();j++) {
                xau.append(Character.toUpperCase(s[0].charAt(j)));
            }
            System.out.println(xau);
        }

    }
}

