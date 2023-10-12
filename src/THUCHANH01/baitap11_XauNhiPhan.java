import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class baitap11_XauNhiPhan {
    public static void main(String[] args) throws IOException, FileNotFoundException,ClassNotFoundException {
        ObjectInputStream obj = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<String> arr = (ArrayList<String>) obj.readObject();

        for (String i : arr) {
            long tong = 0;
            int cnt = 0;
            String s = "";
            for (int j=i.length()-1;j>=0;j--) {
                if (i.charAt(j)=='1') {
                    tong+=Math.pow(2,cnt);
                }
                if (i.charAt(j)=='1' || i.charAt(j)=='0') {
                    cnt++;
                    s = i.charAt(j) + s;
                }
            }
            System.out.println(s + " "+ tong);
        }
    }
}
