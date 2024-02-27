import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Bai3_XulyVanBan1 {
    public static boolean check(String s) {
        for (int i=0;i<s.length();i++) {
            if (Character.isDigit(s.charAt(i))) return false;
        }
        return true;
    }
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("VANBAN.in"));
        Set<String> arr = new TreeSet<>();
        while (sc.hasNextLine()) {
            String s = sc.nextLine();
            String ss = "";
            for (int k = 0; k < s.length(); k++) {
                if (s.charAt(k) == ' ' || s.charAt(k) == '\t' || s.charAt(k) == '\n') {
                    if (check(ss)) arr.add(ss);
                    ss = "";
                }
                else  {
                    ss += s.charAt(k);
                }
            }
            if (Character.isAlphabetic(s.charAt(s.length()-2))) {
                if (check(ss)) arr.add(ss);
                ss ="";
            }
        }

        for (String token : arr) {
            System.out.println(token);
        }
    }
}
