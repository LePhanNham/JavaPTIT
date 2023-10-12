import java.util.Scanner;

public class J04013_BaiToanTuyenSinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ma = sc.nextLine();
        String name = sc.nextLine();
        float diemT = sc.nextFloat();
        float diemL = sc.nextFloat();
        float diemH = sc.nextFloat();
        float tong = diemT*2+diemL+diemH;

        String diemuutien;
        if (ma.charAt(2)=='1') diemuutien = "0.5";
        else if (ma.charAt(2)=='2') diemuutien = "1";
        else diemuutien = "2.5";
        float tongdiem = tong + Float.parseFloat(diemuutien);
        if (tongdiem-(int)tongdiem==0) tongdiem=(int)tongdiem;
        System.out.print(ma + " " + name + " " + diemuutien + " ");
        if ((int)(tong*10)%10==0) {
            System.out.printf("%.0f ",tong);
        }
        else System.out.print(tong+ " ");
        if (tongdiem>=24) System.out.println("TRUNG TUYEN");
        else System.out.println("TRUOT");
    }
}
