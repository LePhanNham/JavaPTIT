import java.util.Scanner;

public class Bai10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int [][] a = new int [m][m];
        for (int i=0;i<m;i++) {
            for (int j=0;j<m;j++) {
                a[i][j] = sc.nextInt();
            }
        }
        int[] sum1 = new int[m];
        int[] sum2 = new int[m];
        int sum3 = 0;
        int sum4 = 0;
        int xmax = 0;
        for (int i=0;i<m;i++) {
            for (int j=0;j<m;j++) {
                sum1[i]+=a[i][j];
                sum2[i]+=a[j][i];
                if (i==j) {
                    sum3+=a[i][j];
                }
                if (i==m-1-j) {
                    sum4+=a[i][j];
                }
            }
            xmax = Math.max(sum1[i],sum2[i]);
        }
        int ymax = Math.max(xmax,Math.max(sum3,sum4));
        System.out.println(ymax);
    }
}
