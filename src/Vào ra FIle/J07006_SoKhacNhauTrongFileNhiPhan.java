import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class J07006_SoKhacNhauTrongFileNhiPhan {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream sc = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<Integer> arr = (ArrayList<Integer>) sc.readObject();
        int[] d = new int[1001];
        for (int i : arr) {
            d[i]++;
        }
        for (int i=0;i<1000;i++) {
            if (d[i]>0) {
                System.out.println(i+" " + d[i]);
            }
        }
    }
}
