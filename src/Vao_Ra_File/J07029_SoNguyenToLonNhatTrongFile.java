import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class J07029_SoNguyenToLonNhatTrongFile {
    public static boolean ktnt(int n) {
        for (int i=2;i<=Math.sqrt(n);i++) {
            if (n%i==0) return false;
        }
        return n>1;
    }
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream sc = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<Integer> arr = (ArrayList<Integer>) sc.readObject();

        int[] d = new int[1000000];
        for (int i : arr) {
            if (ktnt(i)) d[i]++;
        }
        int cnt = 10;
        for (int i=999999;i>1;i-=2) {
            if (d[i]>0) {
                cnt--;
                System.out.println(i + " " + d[i]);
                if (cnt==0) break;
            }
        }
    }
}
