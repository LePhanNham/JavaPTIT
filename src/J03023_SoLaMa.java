import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;

public class J03023_SoLaMa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        Map<Character,Integer> mp = new HashMap<>();
        mp.put('I',1);
        mp.put('V',5);
        mp.put('X',10);
        mp.put('L',50);
        mp.put('C',100);
        mp.put('D',500);
        mp.put('M',1000);
        while (t-->0) {
            int sum = 0;
            String s = sc.next();
            sum+=mp.get(s.charAt(s.length()-1));
            for (int i=s.length()-1;i>0;i-- ){
                if (mp.get(s.charAt(i-1))<mp.get(s.charAt(i))) {
                    sum-=mp.get(s.charAt(i-1));
                }
                else {
                    sum+=mp.get(s.charAt(i-1));
                }
            }
            System.out.println(sum);
        }
    }
}
