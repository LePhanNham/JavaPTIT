import java.io.*;
import java.io.FileNotFoundException;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;


public class J07005_SoKhacNhauTrongFile2 {

    public static void main(String[] args) throws FileNotFoundException,IOException,ClassNotFoundException {
        ObjectInputStream sc = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<Integer> arr = (ArrayList<Integer>) sc.readObject();
        int[] d = new int[1000];
        for (int i : arr) {
            d[i]++;
        }
        for (int i=0;i<1000;i++) {
            if(d[i]>0) {
                System.out.println(i+" "+d[i]);
            }
        }
    }
}
