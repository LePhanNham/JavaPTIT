import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class J07015_SoNguyenToTrongFileNhiPhan {
    public static boolean ktnt(int n) {
        for (int i=2;i<=Math.sqrt(n);i++) {
            if (n%i==0) return false;
        }
        return n>1;
    }
    public static void main(String[] args) throws IOException, FileNotFoundException,ClassNotFoundException {
        ObjectInputStream sc = new ObjectInputStream(new FileInputStream("SONGUYEN.in"));
        ArrayList<Integer> arr = (ArrayList<Integer>) sc.readObject();
        int[] d = new int[10000];
        for (int i : arr) {
            if (ktnt(i)) {
                d[i]++;
            }
        }
        for (int i=2;i<10000;i++) {
            if (d[i]>0) {
                System.out.println(i+ " " + d[i]);
            }
        }
    }
}
