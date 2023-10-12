import java.util.Scanner;

public class J01008_PhanTichThuaSoNguyenTo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        for(int i = 1; i<=t; i++) {
            int n = sc.nextInt();
            System.out.printf("Test %d:",i);
            int j = 2;
            while(n > 1) {
                int dem = 0;
                while(n%j == 0) {
                    n/=j;
                    dem++;
                }
                if(dem > 0) {
                    System.out.printf(" %d(%d) ",j,dem);
                }
                j++;

            }
            System.out.println();
        }
    }
}
