import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;


public class GiaoCua2TapHop {
    public static Scanner ip = new Scanner(System.in);

    public static ArrayList<Integer> check(int[] a, int[] b, int n, int m){
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                if (a[i] == b[j]){
                    arrayList.add(a[i]);
                }
            }
        }
        return arrayList;
    }

    public static void main(String[] args) {
        int n = ip.nextInt();
        int m = ip.nextInt();
        ip.nextLine();

        int[] a = new int[n];
        int[] b = new int[m];

        for (int i = 0; i < n; i++) {
            a[i] = ip.nextInt();
        }
        for (int i = 0; i < m; i++) {
            b[i] = ip.nextInt();
        }

        ArrayList<Integer> result = check(a, b, n, m);
        Collections.sort(result); // Sắp xếp danh sách kết quả

        for (int num : result) {
            System.out.println(num);
        }
    }
}