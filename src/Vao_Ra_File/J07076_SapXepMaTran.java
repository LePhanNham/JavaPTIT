package Vao_Ra_File;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class J07076_SapXepMaTran {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MATRIX.in"));
        int t = sc.nextInt();
        while (t-->0) {
            int m = sc.nextInt();
            int n = sc.nextInt();
            int i = sc.nextInt();
            int a[][] = new int[m+1][n+1];
            int b[] = new int[m+1];
            for (int j=1;j<=m;j++) {
                for (int k=1;k<=n;k++) {
                    a[j][k] = sc.nextInt();
                    if (k==i) b[j]=a[j][k];
                }
            }
            Arrays.sort(b);
            for (int j=1;j<=m;j++) {
                a[j][i] = b[j];
            }
            for (int j=1;j<=m;j++) {
                for (int k=1;k<=n;k++) {
                    System.out.print(a[j][k]+" ");
                }
                System.out.println();
            }

        }
    }
}
