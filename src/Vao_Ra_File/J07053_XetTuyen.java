package Vao_Ra_File;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;

class Person {
    private double dlt,dth,diemthuong;
    private String ma,name;



    private String ngaysinh;

    public Person(String ma,String name, String ngaysinh, double dlt, double dth) {
        this.dlt = dlt;
        this.dth = dth;
        this.ma = ma;
        this.ngaysinh = ngaysinh;

        this.name = name;
    }
    public long diemtong() {
        double tongd = (dlt + dth)/2+DiemUT();
        if (tongd>10) tongd =10;
        return Math.round(tongd);
    }
    public String XepLoai() {
        if (diemtong()<5) return "Truot";
        else if (diemtong()<=6) return "Trung binh";
        else if (diemtong()==7) return "Kha";
        else if (diemtong()==8) return "Gioi";
        else return "Xuat sac";
    }
    public long tinhtuoi() {
        String ss[] = ngaysinh.split("/");
        String nam = ss[2];
        return 2021 - Integer.parseInt(nam);
    }
    public double DiemUT() {
        if (dlt>=8 && dth>=8) {
            return 1;
        }
        else if (dlt>=7.5 && dth>=7.5) {
            return 0.5;
        }
        return 0;
    }
    private String ChuanHoa(String s) {
        String ss[] = s.trim().split("\\s+");
        String ten = "";
        for (int i=0;i<ss.length;i++) {
            ten+=Character.toUpperCase(ss[i].charAt(0));
            for (int j=1;j<ss[i].length();j++) {
                ten+=Character.toLowerCase(ss[i].charAt(j));
            }
            if (i!=ss.length-1) {
                ten+=" ";
            }
        }
        return ten;
    }
    public String toString() {
        return ma + " " + ChuanHoa(name) + " " + tinhtuoi() + " " + diemtong() + " " + XepLoai();
    }
}
public class J07053_XetTuyen {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("XETTUYEN.in"));
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<Person> arr = new ArrayList<>();

        for (int i=1;i<=t;i++) {
            String ma = String.format("PH%02d",i);
            arr.add(new Person(ma,sc.nextLine(),sc.nextLine(),Double.parseDouble(sc.nextLine()),Double.parseDouble(sc.nextLine())));
        }
        for (Person i : arr) {
            System.out.println(i);
        }
    }
}
