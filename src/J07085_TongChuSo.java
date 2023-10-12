import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class J07085_TongChuSo {
    public static void main(String[] args) throws FileNotFoundException, IOException,ClassNotFoundException {
        ObjectInputStream sc = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<String> arr = (ArrayList<String>) sc.readObject();
        for (String s : arr) {
            String number = "";
            int sum = 0;
            for (int i=0;i<s.length();i++) {
                if (Character.isDigit(s.charAt(i))) {
                    sum+=Character.getNumericValue(s.charAt(i));
                    if ((number.equals("") && s.charAt(i)!='0') || !number.equals("")) {
                        number+=s.charAt(i);
                    }
                }
            }
            System.out.println(number + " " + sum);
        }
    }
}
