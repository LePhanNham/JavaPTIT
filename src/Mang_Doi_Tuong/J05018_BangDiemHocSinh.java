package Mang_Doi_Tuong;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class Bangdiem {
    private String ma,ten,xl;
    private double a[],tongdiem;

    public Bangdiem(String ma, String ten, double[] a) {
        this.ma = ma;
        this.ten = ten;
        this.a = a;
        double tong = a[0]+a[1];
        for (int i=0;i<10;i++) {
            tong+=a[i];
        }
        tong/=12;
        if (tong<5) {
            this.xl = "YEU";
        }
        else if (tong<7) {
            this.xl = "TB";
        }
        else if (tong<8) {
            this.xl = "KHA";
        }
        else if (tong<9) {
            this.xl = "GIOI";
        }
        else {
            this.xl = "XUAT SAC";
        }
        this.tongdiem =(double) Math.round((tong)*10)/10;
    }

    public double getTongdiem() {
        return tongdiem;
    }

    public String getMa() {
        return ma;
    }
    public String toString() {
        return ma + " " + ten + " " + String.format("%.1f",tongdiem) + " " + xl;
    }
}
public class J05018_BangDiemHocSinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        ArrayList<Bangdiem> arr = new ArrayList<>();

        for (int i=1;i<=t;i++) {
            sc.nextLine();
            String ma = String.format("HS%02d",i);
            String name = sc.nextLine();
            double a[] = new double[10];
            for (int j=0;j<10;j++) {
                a[j] = sc.nextDouble();
            }
            arr.add(new Bangdiem(ma,name,a));
        }
        Collections.sort(arr, new Comparator<Bangdiem>() {
            @Override
            public int compare(Bangdiem o1, Bangdiem o2) {
                if (o1.getTongdiem() == o2.getTongdiem()) {
                    return o1.getMa().compareTo(o2.getMa());
                }
                return o1.getTongdiem()<o2.getTongdiem()?1:-1;
            }
        });
        for (Bangdiem i : arr) {
            System.out.println(i);
        }

    }
}


//3
//Luu Thuy Nhi
//9.3  9.0  7.1  6.5  6.2  6.0  8.2  6.7  4.8  5.5
//Le Van Tam
//8.0  8.0  5.5  9.0  6.8  9.0  7.2  8.3  7.2  6.8
//Nguyen Thai Binh
//9.0  6.4  6.0  7.5  6.7  5.5  5.0  6.0  6.0  6.0