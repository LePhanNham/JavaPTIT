import java.io.*;
import java.util.*;

public class FileTrongJava {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("DATA.in"));
        while (sc.hasNextLine()) {
            System.out.println(sc.nextLine());
        }
//        File file = new File("newFile.txt");
//        System.out.println(file.length());
    }
}
