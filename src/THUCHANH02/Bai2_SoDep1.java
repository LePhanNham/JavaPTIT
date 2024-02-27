import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Bai2_SoDep1 {
    public static boolean check(String s) {
        for (int i=0;i<s.length()-1;i++) {
            if (s.charAt(i+1)<s.charAt(i)) return false;
        }
        return true;
    }
    public static void main(String[] args) throws FileNotFoundException, IOException,ClassNotFoundException {
        ObjectInputStream sc = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ArrayList<Integer> arr = (ArrayList<Integer>) sc.readObject();
        int d[] = new int[10000];
        for (int i : arr) {
            if (check(String.valueOf(i))) {
                d[i]++;
            }
        }
        ObjectInputStream sc2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> arr2 = (ArrayList<Integer>) sc.readObject();
        int d2[] = new int[10000];
        for (int i : arr2) {
            if (check(String.valueOf(i))) {
                d2[i]++;
            }
        }
        for (int i=10;i<=9999;i++) {
            if (d[i]>0 && d2[i]>0) {
                System.out.println(i + " " + d[i] + " " + d2[i]);
            }
        }
    }
}
