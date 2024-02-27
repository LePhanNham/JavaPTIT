package Vao_Ra_File;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class BangDiem implements Comparable<BangDiem> {
    private String name,ma;
    private double d1,d2,d3;
    private int xl;

    public BangDiem(String ma,String name, double d1, double d2, double d3) {
        this.ma = ma;
        this.name = name;
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
    }

    public void setXl(int xl) {
        this.xl = xl;
    }
    private String ChuanHoa(String s ) {
        String ss[] = s.trim().split("\\s+");
        String name = "";
        for (int i = 0;i<ss.length;i++) {
            name +=Character.toUpperCase(ss[i].charAt(0));
            for (int j=1;j<ss[i].length();j++) {
                name +=Character.toLowerCase(ss[i].charAt(j));
            }
            if(i!=ss.length-1) name +=" ";
        }
        return name;
    }
    public double TinhDiem() {
        return (d1*3+d2*3+d3*2)/8;
    }

    public int compareTo(BangDiem o1 ) {
        if (this.TinhDiem()==o1.TinhDiem()) return this.ma.compareTo(o1.ma);
        return this.TinhDiem()<o1.TinhDiem()?1:-1;
    }
    public String toString() {
        return ma + " " + ChuanHoa(name) + " " + String.format("%.2f",TinhDiem()) + " " + xl;
    }
}
public class J07054_TinhDiemTrungBinh {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("BANGDIEM.in"));
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<BangDiem> arr = new ArrayList<>();
        for (int i=1;i<=t;i++) {
            String ma = String.format("SV%02d",i);
            String name = sc.nextLine();
            double d1 = Double.parseDouble(sc.nextLine());
            double d2 = Double.parseDouble(sc.nextLine());
            double d3 = Double.parseDouble(sc.nextLine());
            arr.add(new BangDiem(ma,name,d1,d2,d3));
        }
        Collections.sort(arr);
        int xl = 1;
        arr.get(0).setXl(1);
        for (int i=1;i<arr.size();i++) {
            if (arr.get(i).TinhDiem()!=arr.get(i-1).TinhDiem())  {
                xl=i+1;
            }
            arr.get(i).setXl(xl);
        }
        for (BangDiem i : arr) {
            System.out.println(i);
        }
    }
}
