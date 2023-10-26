
import java.io.*;
import java.util.Scanner;


public class J07002_TinhTong {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("DATA.in"));
        long sum = 0;
        while (sc.hasNext()) {
            try {
                int so = Integer.parseInt(sc.next());
                sum+=so;
            }catch (NumberFormatException e) {

            }
        }
        System.out.println(sum);
    }
}
