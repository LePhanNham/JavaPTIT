package Vao_Ra_File;

import java.io.File;
import java.io.FileNotFoundException;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

class ThoiGian implements Comparable<ThoiGian>{
    private String name,tgvao,tgra;
    private long tongthoigian;

    public ThoiGian(String name, Date tgvao, Date tgra) {
        this.name = name;
        this.tongthoigian = tgra.getTime()-tgvao.getTime();
        this.tongthoigian/=60000;

    }
    public int compareTo(ThoiGian o1) {
        if (this.tongthoigian==o1.tongthoigian) return this.name.compareTo(o1.name);
        return this.tongthoigian<o1.tongthoigian?1:-1;
    }
    public String toString() {
        return this.name + " " + this.tongthoigian;
    }
}
public class J07084_ThoiGianOnlineLienTuc {
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        Scanner sc = new Scanner(new File("ONLINE.in"));
        int t = Integer.parseInt(sc.nextLine());
        SimpleDateFormat mydate = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        ArrayList<ThoiGian> arr = new ArrayList<>();
        while (t-->0) {
            String name = sc.nextLine();
            Date giovao = mydate.parse(sc.nextLine());
            Date giora = mydate.parse(sc.nextLine());
            arr.add(new ThoiGian(name,giovao,giora));
        }
        Collections.sort(arr);
        for (ThoiGian i : arr) {
            System.out.println(i);
        }
    }
}
