import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
class SVien implements Comparable<SVien> {
    public String name;
    public int correct,submit;

    public SVien(String name, int correct, int submit) {
        this.name = name;
        this.correct = correct;
        this.submit = submit;
    }

    public int compareTo(SVien other) {
        if (this.correct == other.correct) {
            if (this.submit == other.submit) {
                return this.name.compareTo(other.name);
            }
            return this.submit - other.submit;
        }
        return -(this.correct-other.correct);
    }

    @Override
    public String toString() {
        return name+" "+correct+" "+submit;
    }
}

public class baitap10_luyentap {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("LUYENTAP.in"));
        int n = sc.nextInt();
        ArrayList<SVien> arr = new ArrayList<>();
        while (n-->0) {
            sc.nextLine();
            SVien a = new SVien(sc.nextLine(),Integer.parseInt(sc.next()),Integer.parseInt(sc.next()));
            arr.add(a);
        }
        Collections.sort(arr);
        for (SVien i : arr) {
            System.out.println(i);
        }
    }
}
