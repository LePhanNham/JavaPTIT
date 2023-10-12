import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;
public class J03010_DiaChiEmail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int cnt;
        ArrayList<String> arr = new ArrayList<>();
        sc.nextLine();
        while (t-->0) {
            String name = sc.nextLine();
            name = name.trim();
            String s[] = name.split("\\s+");
            String s2 = s[s.length-1].toLowerCase();

            for (int i=0;i<s.length-1;i++) {
                s2+=Character.toLowerCase(s[i].charAt(0));
            }
            arr.add(s2);
            cnt = Collections.frequency(arr,s2);
            s2 += (cnt==1 ?"" : cnt) + "@ptit.edu.vn";
            System.out.println(s2);
        }
    }
}
