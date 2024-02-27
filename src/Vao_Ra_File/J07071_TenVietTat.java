package Vao_Ra_File;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class J07071_TenVietTat {
    public static String VietTat(String s) {
        String ss[] = s.trim().split("\\s+");
        String name="";
        for (int i =0;i<ss.length;i++) {
            name+=Character.toUpperCase(ss[i].charAt(0));
        }
        return name;
    }
    public static String VietTat2(String s) {
        String ss = "";
        for (int i=0;i<s.length();i++) {
            if (s.charAt(i)!='.') {
                ss+=s.charAt(i);
            }
        }
        return ss;
    }
    public static boolean check(String s1,String s2) {
        if (s1.length()!=s2.length()) return false;
        int cnt = 0;
        for (int i=0;i<s2.length();i++) {
//            System.out.println(ss[i]);
            if ((s2.charAt(i)=='*'|| s2.charAt(i)==s1.charAt(i))) {
                cnt++;
            }
        }
        if (cnt==s2.length()) return true;
        return false;
    }
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DANHSACH.in"));
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<String> arr = new ArrayList<>();
        while (t-->0) {
             String name = sc.nextLine();
             arr.add(name);
        }
        int q= Integer.parseInt(sc.nextLine());
        while (q-->0) {
            String tvt = sc.nextLine();
            ArrayList<String> a = new ArrayList<>();
            for (String i : arr) {
                if (check(VietTat(i),VietTat2(tvt))) {
                    a.add(i);
                }
            }
            Collections.sort(a, new Comparator<String>() {
                public int compare(String s1, String s2) {
                    String[] x1 = s1.trim().split("\\s+");
                    String[] x2 = s2.trim().split("\\s+");
                    if (!x1[x1.length - 1].equals(x2[x2.length - 1])){
                        return x1[x1.length - 1].compareTo(x2[x2.length - 1]);
                    }
                    return x1[0].compareTo(x2[0]);
                }
            });
            for (String i : a) {
                System.out.println(i);
            }
        }

    }
}
