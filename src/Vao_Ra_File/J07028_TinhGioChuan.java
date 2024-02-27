package Vao_Ra_File;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class J07028_TinhGioChuan {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc1 = new Scanner(new File("MONHOC.in"));
        int t = sc1.nextInt();
        Map<String,String> mp1 = new HashMap<>();
        while (t-->0) {
            String ma = sc1.next();
            String mon = sc1.next();
            mp1.put(ma,mon);
        }
        Scanner sc2 = new Scanner(new File("GIANGVIEN.in"));
        int t2 = Integer.parseInt(sc2.nextLine());
        HashMap<String,String> mp2 = new HashMap<>();
        ArrayList<String> arr = new ArrayList<>();
        while (t2-->0) {
            String s[] = sc2.nextLine().trim().split("\\s+");
            String ma2 = s[0];
            arr.add(ma2);
            String ten2 = "";

            for (int i=1;i<s.length;i++) {
                ten2 +=s[i] + " ";

            }
            mp2.put(ma2,ten2.trim());
        }
        HashMap<String,Double> mp3 = new HashMap<>();
        Scanner sc3 = new Scanner(new File("GIOCHUAN.in"));
        int t3 = sc3.nextInt();

        for (int i=1;i<=t3;i++) {
            String magv = sc3.next();
            String mamon = sc3.next();
            double gio = sc3.nextDouble();
            if (mp3.containsKey(magv)) {
                mp3.put(magv,mp3.get(magv)+gio);
            }
            else {
                mp3.put(magv,gio);
            }
        }
        for (String i : arr) {
            System.out.println(mp2.get(i) + " " + String.format("%.2f",mp3.get(i)));
        }
    }
}
