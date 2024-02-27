package Mang;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class J02024_DayConCoTongLe {
    public static int a[] = new int[16];
    public static void Try(int i,int n) {
        for (int j=0;j<=1;j++) {
            a[i] = j;
            if (i==n) {

            }
            else {
                Try(i+1,n);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            int n = sc.nextInt();
            ArrayList<Integer> arr = new ArrayList<>();
            for (int i =0;i<n;i++) {
                int x = sc.nextInt();
                arr.add(x);
            }
            Collections.sort(arr,Collections.reverseOrder());


        }
    }
}
