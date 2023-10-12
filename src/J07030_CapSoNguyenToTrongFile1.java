import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class J07030_CapSoNguyenToTrongFile1 {
    public static boolean ktnt(int n) {
        for (int i=2;i<=Math.sqrt(n);i++){
            if (n%i==0) return false;
        }
        return n>1;
    }
    public static void main(String[] args) throws FileNotFoundException, IOException,ClassNotFoundException {
        ObjectInputStream sc1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ArrayList <Integer> arr1 = (ArrayList<Integer>) sc1.readObject();
        ObjectInputStream sc2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList <Integer> arr2 = (ArrayList<Integer>) sc2.readObject();
        Set<Integer> st1 = new TreeSet<>();
        for (int i : arr1) {
            if (ktnt(i)) {
                st1.add(i);
            }
        }
        Set<Integer> st2 = new TreeSet<>();
        for (int i : arr2) {
            if (ktnt(i)) {
                st2.add(i);
            }
        }
        final int sum = 1000000;
        for (Integer i : st1) {
            if (i*2>=sum) {
                break;
            }
            if (st2.contains(sum-i)) {
                System.out.println(i + " " + (sum-i));
            }
        }
    }
}
