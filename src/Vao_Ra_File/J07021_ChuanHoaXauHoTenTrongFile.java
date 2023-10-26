import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class J07021_ChuanHoaXauHoTenTrongFile {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        while (sc.hasNext()) {
            String name = sc.nextLine();
            if (name.equals("END")) {
                break;
            }
            name = name.trim();
            String s[] = name.split("\\s+");
            String ten = "";
            for (int i=0;i<s.length;i++) {
                ten+=Character.toUpperCase(s[i].charAt(0));
                for (int j=1;j<s[i].length();j++ ) {
                    ten+=Character.toLowerCase(s[i].charAt(j));
                }
                if (i!=s.length-1) ten+=" ";
            }
            System.out.println(ten);
        }
    }
}
