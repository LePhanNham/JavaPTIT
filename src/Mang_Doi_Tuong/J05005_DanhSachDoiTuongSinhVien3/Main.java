package J05005_DanhSachDoiTuongSinhVien3;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        ArrayList<J05005_DanhSachDoiTuongSinhVien3.SinhVien3> arr = new ArrayList<>();
        for (int i=1;i<=t;i++) {
            sc.nextLine();
            String ma = String.format("B20DCCN%03d",i);
            arr.add(new J05005_DanhSachDoiTuongSinhVien3.SinhVien3(ma,sc.nextLine(),sc.next(),sc.next(),sc.nextDouble()));
        }
        Collections.sort(arr);
        for (J05005_DanhSachDoiTuongSinhVien3.SinhVien3 i : arr) {
            System.out.println(i);
        }
    }
}
