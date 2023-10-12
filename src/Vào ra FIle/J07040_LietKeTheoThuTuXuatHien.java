import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class J07040_LietKeTheoThuTuXuatHien {
    public static void main(String[] args) throws FileNotFoundException, IOException,ClassNotFoundException {
        ObjectInputStream sc = new ObjectInputStream(new FileInputStream("NHIPHAN.in"));
        ArrayList<String> arr = (ArrayList<String>) sc.readObject();
        Set<String> ss = new TreeSet<>();
        for (String s : arr) {
            String s5[] = s.trim().toLowerCase().split("\\s+");
            for (int i=0;i<s5.length;i++) {
                ss.add(s5[i]);
            }
        }
        Scanner sc2 = new Scanner(new File("VANBAN.in"));
        while (sc2.hasNext()) {
            String s6 = sc2.next().toLowerCase();
            if (ss.contains(s6)) {
                System.out.println(s6);
                ss.remove(s6);
            }
        }


    }
}
