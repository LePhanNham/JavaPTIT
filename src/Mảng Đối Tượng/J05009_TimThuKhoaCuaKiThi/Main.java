package J05009_TimThuKhoaCuaKiThi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<ThiSinh> arr = new ArrayList<>();
        int t =sc.nextInt();

        for (int i=1;i<=t;i++) {
            sc.nextLine();
            arr.add(new ThiSinh(i,sc.nextLine(),sc.nextLine(),sc.nextDouble(),sc.nextDouble(),sc.nextDouble()));
        }

        Collections.sort(arr);
        double diem = arr.get(0).getTong();
        for (ThiSinh i : arr) {
            if (i.getTong()==diem) {
                System.out.println(i);
            }
        }
    }
}
//3
//Nguyen Van A
//12/12/1994
//3.5
//7.0
//5.5
//Nguyen Van B
//1/9/1994
//7.5
//9.5
//9.5
//Nguyen Van C
//6/7/1994
//8.5
//9.5
//8.5