package J05003_DanhSachDoiTuongSinhVien;

import java.util.Scanner;
import java.text.ParseException;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        for (int i=1;i<=t;i++) {
            SinhVien a = new SinhVien(sc.nextLine(),i,sc.nextLine(),sc.nextLine(),sc.nextDouble());
            System.out.println(a);
            sc.nextLine();
        }
    }
}
