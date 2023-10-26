import java.util.Scanner;

public class J02103_TichMaTranVoiChuyenViCuaNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i=1;i<=t;i++) {
            int m = sc.nextInt();
            int n = sc.nextInt();
            int [][] a= new int[m][n];
            int [][] b= new int[n][m];
            int [][] c = new int [m][m];
            for (int j=0;j<m;j++) {
                for (int k=0;k<n;k++) {
                    a[j][k]= sc.nextInt();
                    b[k][j]=a[j][k];
                }
            }
            for (int j=0;j<m;j++) {
                for (int k=0;k<m;k++) {
                    c[j][k] = 0;
                }
            }
            for (int j=0;j<m;j++) {
                for (int k=0;k<m;k++) {
                    for (int o=0;o<n;o++) {
                        c[j][k] +=a[j][o]*b[o][k];
                    }
                }
            }
            System.out.println("Test " + i + ":" );
            for (int j=0;j<m;j++) {
                for (int k=0;k<m;k++) {
                    System.out.print(c[j][k]+" ");
                }
                System.out.println( );
            }
        }
    }
}
