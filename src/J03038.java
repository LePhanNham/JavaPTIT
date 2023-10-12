import java.util.Scanner;

public class J03038 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(s.chars().distinct().count());
    }
}
