import java.util.Scanner;

public class J04018_SoPhuc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();
            int t1 = a*a + a*c - b*b - b*d;
            int ao1 = 2*a*b + a*d + b*c;
            int t2 = (a+c)*(a+c) - (b+d)*(b+d);
            int ao2 = 2*(a+c)*(b+d);

            System.out.print(t1);

            if (ao1>=0) {
                System.out.print(" + ");
                System.out.print(ao1 + "i");
            }
            else {

                System.out.print(" - " + Math.abs(ao1) + "i");
            }
            System.out.print(", ");
            System.out.print(t2);


            if (ao2>=0) {
                System.out.print(" + "+ ao2 + "i");
            }
            else {
                System.out.print(" - " + Math.abs(ao2) + "i");
            }
            System.out.println();
        }
    }
}
