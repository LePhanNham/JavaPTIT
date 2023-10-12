import java.io.*;
import java.util.ArrayList;

public class J07032_SoThuanNghichTrongFile {
    public static boolean check(String s) {
        StringBuilder ss = new StringBuilder(s).reverse();
        if (!ss.toString().equals(s)) {
            return false;
        }
        if (s.length()%2==0 || s.length()==1) return false;
        for (int i=0;i<s.length();i++) {
            if ((s.charAt(i)-'0')%2==0) return false;
        }
        return true;
    }
    public static void main(String[] args) throws FileNotFoundException, IOException,ClassNotFoundException {
        ObjectInputStream oj1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ArrayList<Integer> arr1 = (ArrayList<Integer>) oj1.readObject();
        int[] d1 = new int[1000000];
        for (Integer i : arr1) {
            if (check(i.toString())) {
                d1[i]++;
            }
        }
        ObjectInputStream oj2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> arr2 = (ArrayList<Integer>) oj2.readObject();
        int[] d2 = new int[1000000];
        for (Integer i : arr2) {
            if(check(i.toString()) && d1[i]>0) {
                d2[i]++;
            }
        }
        int cnt=10;
        for (int i=11;i<=1000000;i++) {
            if (d1[i]>0 && d2[i]>0) {
                System.out.println(i+ " " + (d1[i]+d2[i]));
                cnt--;
                if (cnt==0) break;
            }
        }
    }
}
