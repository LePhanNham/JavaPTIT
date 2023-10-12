import java.util.Scanner;


public class J01025 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a1 = sc.nextInt();
        int a2 = sc.nextInt();
        int a3 = sc.nextInt();
        int a4 = sc.nextInt();
        int b1 = sc.nextInt();
        int b2 = sc.nextInt();
        int b3 = sc.nextInt();
        int b4 = sc.nextInt();
        int s = Math.max(Math.abs(Math.max(a3,b3)-Math.min(a1,b1)),Math.abs(Math.max(a4,b4)-Math.min(a2,b2)));
        System.out.println(s*s);
    }
}
