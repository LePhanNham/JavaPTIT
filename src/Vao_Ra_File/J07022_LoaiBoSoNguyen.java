import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class J07022_LoaiBoSoNguyen {
    public static void main(String[] args)throws IOException {
        Scanner sc = new Scanner(new File("DATA.in"));
        ArrayList<String> arr = new ArrayList<>();
        String s = "";
        while (sc.hasNext()) {
            try {
                s = sc.next();
                int so = Integer.parseInt(s);
            }
            catch (NumberFormatException e) {
                arr.add(s);
            }
        }
        Collections.sort(arr);
        for (String i : arr) {
            System.out.print(i + " ");
        }
    }
}
