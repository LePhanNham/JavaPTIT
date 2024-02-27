package Mang_Doi_Tuong;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Scanner;

class TinhTuoi implements Comparable<TinhTuoi> {
    private String name;
    private long time;

    public TinhTuoi(String name, Date d) throws ParseException{
        this.name = name;
        SimpleDateFormat day = new SimpleDateFormat("dd/MM/yyyy");
        Date tuoi = day.parse("13/11/2023");
        this.time = tuoi.getTime() - d.getTime();

    }

    public int compareTo(TinhTuoi o1) {
        return Long.compare(this.time,o1.time);
    }
    public String toString() {
        return this.name;
    }
}
public class J05032_TreNhatGiaNhat {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<TinhTuoi> arr = new ArrayList<>();
        SimpleDateFormat s = new SimpleDateFormat("dd/MM/yyyy");
        while (t-->0) {
            String test[] = sc.nextLine().split(" ");
            arr.add(new TinhTuoi(test[0],s.parse(test[1])));

        }
        Collections.sort(arr);
        System.out.println(arr.get(0));
        System.out.println(arr.get(arr.size()-1));
    }
}
//5
//Nam 01/10/1991
//An 30/12/1990
//Binh 15/08/1993
//Tam 18/09/1990
//Truong 20/09/1990
