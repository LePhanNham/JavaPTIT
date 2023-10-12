import java.util.Scanner;

public class J02020_LietKeToHop1 {

    static int N,K;
    static int []a;
    static int cnt = 0;
    public static void Try(int i) {
        for (int j = a[i-1]+1;j<=N-K+i;j++) {
            a[i]=j;
            if (i==K) {
                cnt++;
                for(int z=1;z<=K;z++) {
                    System.out.print(a[z]+" ");
                }
                System.out.println();
            }
            else Try(i+1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        K = sc.nextInt();
        a = new int[K+1];
        Try(1);
        System.out.println("Tong cong co " + cnt + " to hop");
    }
}
