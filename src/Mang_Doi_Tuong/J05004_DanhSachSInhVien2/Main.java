package J05004_DanhSachSInhVien2;


import java.text.ParseException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        for (int i=1;i<=t;i++) {
            J05004_DanhSachSInhVien2.SinhVien a = new J05004_DanhSachSInhVien2.SinhVien(sc.nextLine(),i,sc.nextLine(),sc.nextLine(),sc.nextDouble());
            System.out.println(a);
            sc.nextLine();
        }
    }
}
