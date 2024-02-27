package Vao_Ra_File;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Date;
import java.util.Scanner;
class KHang {
    private String makh,hoten,diachi,masp;
    private Date ngaymua;
    private int soluongmua;

}
class CUaHang {
    private String masp,tensp;

}
public class J07049_TinhNgayHetHanBaoHanh {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MUAHANG.in"));
        int t = Integer.parseInt(sc.nextLine());
        for (int i =1;i<=t;i++) {
            String ma = sc.nextLine();
            String ten = sc.nextLine();
            int giaban = Integer.parseInt(sc.nextLine());
            int thoihan = Integer.parseInt(sc.nextLine());
        }
        int t2 = Integer.parseInt(sc.nextLine());
        for (int i=1;i<=t2;i++) {
            String hotenkh = sc.nextLine();

        }
    }
}
