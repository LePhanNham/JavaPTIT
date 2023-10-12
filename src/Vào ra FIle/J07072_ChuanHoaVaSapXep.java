import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class HoTen implements Comparable<HoTen>{
    private String hoten,tenhodem;

    public HoTen(String hoten) {
        this.hoten = hoten;
        String ss[] = hoten.split(" ");
        String name = ss[ss.length-1] + " ";
        for (int i=0;i<ss.length-1;i++) {
            name +=ss[i];
            if (i!=ss.length-2) name+=" ";
        }
        this.tenhodem = name;
    }

    public int compareTo(HoTen o1) {
        return this.tenhodem.compareTo(o1.tenhodem);
    }

    public String toString() {
        return this.hoten;
    }
}
public class J07072_ChuanHoaVaSapXep {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DANHSACH.in"));
        ArrayList<HoTen> arr = new ArrayList<>();
        while (sc.hasNextLine()) {
            String s = sc.nextLine();
            s = s.trim();
            String name[] = s.split("\\s+");
            StringBuilder ss = new StringBuilder();
            for (int i=0;i<name.length;i++) {
                ss.append(Character.toUpperCase(name[i].charAt(0)));
                for (int j=1;j<name[i].length();j++) {
                    ss.append(Character.toLowerCase(name[i].charAt(j)));
                }
                if (i!=name.length-1) ss.append(" ");
            }
            arr.add(new HoTen(ss.toString()));
        }
        Collections.sort(arr);
        for (HoTen i : arr) {
            System.out.println(i);
        }
    }
}
