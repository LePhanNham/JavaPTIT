import java.util.Scanner;

public class J04012_BaiToanTinhCong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int lcb = sc.nextInt();
        int ngay = sc.nextInt();
        String cv = sc.next();
        int luongthang = lcb*ngay;
        int thuong;
        if (ngay>=25) thuong = luongthang*20/100;
        else if (ngay>=22) thuong = luongthang*10/100;
        else thuong = 0;
        int pc = 0;
        if (cv.equals("GD")) pc = 250000;
        else if (cv.equals("PGD")) pc = 200000;
        else if (cv.equals("TP")) pc = 180000;
        else pc = 150000;
        int thunhap = luongthang + thuong + pc;
        System.out.println("NV01 " + name + " " + luongthang + " " + thuong + " " + pc + " " + thunhap);
    }
}
