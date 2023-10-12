import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class ThietLapDiaChiEmail {
    public static String ChuanHoa(String s) {
        String ss[] = s.trim().toLowerCase().split("\\s+");
        String name = ss[ss.length-1];
        for (int i=0;i<ss.length-1;i++) {
            name+=ss[i].charAt(0);
        }
        return name;
    }
    public static void main(String[] args) throws FileNotFoundException {
        HashMap<String,Integer> hm = new HashMap<>();
        Scanner sc = new Scanner(new File("DANHSACH.in"));

        while (sc.hasNextLine()) {
            String name = sc.nextLine();
            if (hm.isEmpty() || !hm.containsKey(name)) {
                hm.put(name,1);
            }
            else {
                hm.put(name,hm.get(name)+1);
                name+=String.valueOf(hm.get(name));

            }



        }
    }
}
