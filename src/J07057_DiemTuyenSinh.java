import java.awt.desktop.ScreenSleepEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class THISINH implements Comparable<THISINH>{
    private String id,name,dantoc,trangthai;
    private int khuvuc;
    private double diem;

    public THISINH(String id, String name,double diem, String dantoc, int khuvuc) {
        this.id = id;
        this.name = name;
        this.diem = diem;
        this.dantoc = dantoc;
        this.khuvuc = khuvuc;
        if (this.khuvuc==1) {
            this.diem+=1.5;
        }
        else if (this.khuvuc==2) {
            this.diem+=1;
        }

        if (!this.dantoc.equals("Kinh")) {
            this.diem+=1.5;
        }
        if (this.diem>=20.5) {
            this.trangthai = "Do";
        }
        else {
            this.trangthai = "Truot";
        }
    }
    public int compareTo(THISINH o1) {
        if (this.diem==o1.diem) {
            return this.id.compareTo(o1.id);
        }
        return this.diem<o1.diem?1:-1;
    }
    public String toString() {
        return this.id + " " + this.name + " " + String.format("%.1f",this.diem) + " " + this.trangthai;
    }
}
public class J07057_DiemTuyenSinh {
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
        Scanner sc = new Scanner(new File("THISINH.in"));
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<THISINH> arr = new ArrayList<>();
        for (int i=1;i<=t;i++) {
            String ma = String.format("TS%02d",i);
            arr.add(new THISINH(ma,ChuanHoa(sc.nextLine()),Double.parseDouble(sc.nextLine()),sc.nextLine(),Integer.parseInt(sc.nextLine())));
        }
        Collections.sort(arr);
        for (THISINH i : arr) {
            System.out.println(i);
        }
    }
}
