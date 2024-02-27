package Mang_Doi_Tuong;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Person implements Comparable<Person> {
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
    public int compareTo(Person o1) {
        if (this.diemtong()==o1.diemtong()) {
            return this.ma.compareTo(o1.ma);
        }
        return this.diemtong()<o1.diemtong()?1:-1;
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
public class J05061_SapXepKetQuaXetTuyen {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<Person> arr = new ArrayList<>();

        for (int i=1;i<=t;i++) {
            String ma = String.format("PH%02d",i);
            arr.add(new Person(ma,sc.nextLine(),sc.nextLine(),Double.parseDouble(sc.nextLine()),Double.parseDouble(sc.nextLine())));
        }
        Collections.sort(arr);
        for (Person i : arr) {
            System.out.println(i);
        }
    }
}

//3
//Doan Thi Kim
//13/03/1982
//8
//9.5
//Dinh Thi Ngoc Ha
//03/09/1996
//6.5
//8
//Tran Thanh Mai
//12/09/2004
//8
//9