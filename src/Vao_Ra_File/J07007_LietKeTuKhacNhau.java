import java.util.HashSet;
import java.util.Scanner;
import java.io.*;
import java.util.Set;
import java.util.TreeSet;

class WordSet {
    private Set<String> set;

    WordSet(String file) throws FileNotFoundException {
        Scanner sc = new Scanner(new File(file));
        set = new TreeSet<>();
        while (sc.hasNext()) {
            set.add(sc.next().toLowerCase());
        }
    }

    public String toString() {
        String s = "";
        for (String i : set) {
            s+=i + '\n';
        }
        return s;
    }
}
public class J07007_LietKeTuKhacNhau {
    public static void main(String[] args) throws IOException {
        WordSet ws = new WordSet("VANBAN.in");
        System.out.println(ws);
    }
}
