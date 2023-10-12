import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.io.IOException;
class LoaiPhong implements Comparable<LoaiPhong> {
    String line,ten;


    public LoaiPhong(String ss) {
        this.line = ss;
        String s[] = ss.trim().split("\\s+");
        this.ten = s[1];
    }

    @Override
    public String toString() {
        return line;
    }

    public String getTen() {
        return ten;
    }

    public int compareTo(LoaiPhong o) {
        return ten.compareTo(o.getTen());
    }
}
public class J07045_LoaiPhong {
    public static void main(String[] args) throws IOException {
        ArrayList<LoaiPhong> ds = new ArrayList<>();
        Scanner in = new Scanner(new File("PHONG.in"));
        int n = Integer.parseInt(in.nextLine());
        while(n-->0){
            ds.add(new LoaiPhong(in.nextLine()));
        }
        Collections.sort(ds);
        for(LoaiPhong tmp : ds){
            System.out.println(tmp);
        }
    }
}
