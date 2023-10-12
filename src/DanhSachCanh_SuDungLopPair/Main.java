package DanhSachCanh_SuDungLopPair;


import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Pair<Integer,Integer>> arr = new ArrayList<>();
        int n = sc.nextInt();
        int a[][] = new int[n][n];
        for (int i=0;i<n;i++) {
            for (int j=0;j<n;j++) {
                a[i][j] = sc.nextInt();
            }
        }
        for (int i=0;i<n;i++) {
            for (int j=i+1;j<n;j++) {
                if (a[i][j]==1) {
                    Pair<Integer,Integer> ss = new Pair<>(i+1,j+1);
                    arr.add(ss);

                }
            }
        }
        for (Pair i : arr) {
            System.out.println(i);
        }
    }
}
