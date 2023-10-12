import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class Sinh_Vien implements Comparable<Sinh_Vien> {
    private String id,name,xeploai;
    private double diemtb;

    Sinh_Vien(String id, String name,int diemlt,int diemth,int diemthi) {
        this.id = id;
        this.name = name;
        this.diemtb = (double)diemlt*25/100 + (double) diemth*35/100 + (double) diemthi*40/100;
        if (this.diemtb>=8) {
            this.xeploai = "GIOI";
        }
        else if (this.diemtb>=6.5) {
            this.xeploai = "KHA";
        }
        else if (this.diemtb>=5) {
            this.xeploai = "TRUNG BINH";
        }
        else {
            this.xeploai = "KEM";
        }
    }
    public int compareTo(Sinh_Vien o1) {
        return this.diemtb<o1.diemtb?1:-1;
    }

    public String toString() {
        return this.id + " " + this.name + " " + String.format("%.2f",this.diemtb) + " " + this.xeploai;
    }
}
public class J07055_XepLoai {
    public static String ChuanHoa(String s) {
        s = s.trim();
        String ss[] = s.split("\\s+");
        String name = "";
        for (int i=0;i<ss.length;i++) {
            name+=Character.toUpperCase(ss[i].charAt(0));
            for (int j=1;j<ss[i].length();j++) {
                name+=Character.toLowerCase(ss[i].charAt(j));
            }
            if (i!=ss.length-1) {
                name+=" ";
            }
        }
        return name;
    }

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("BANGDIEM.in"));
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<Sinh_Vien> arr = new ArrayList<>();
        for (int i=1;i<=t;i++) {
            String ma = String.format("SV%02d",i);
            arr.add(new Sinh_Vien(ma,ChuanHoa(sc.nextLine()),Integer.parseInt(sc.nextLine()),Integer.parseInt(sc.nextLine()),Integer.parseInt(sc.nextLine())));
        }
        Collections.sort(arr);
        for (Sinh_Vien i : arr) {
            System.out.println(i);
        }
    }
}
