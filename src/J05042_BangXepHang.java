import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class SinhVienPtit implements Comparable<SinhVienPtit>{
    private String name;
    private int correct,submit;

    public SinhVienPtit(String name, int correct, int submit) {
        this.name = name;
        this.correct = correct;
        this.submit = submit;
    }
    public int compareTo(SinhVienPtit sv) {
        if (this.correct==sv.correct) {
            if (this.submit==sv.submit) {
                return this.name.compareTo(sv.name);
            }
            return this.submit-sv.submit;
        }
        return -(this.correct-sv.correct);
    }
    public String toString() {
        return this.name + " " + String.valueOf(this.correct) + " " +String.valueOf(this.submit);
    }
}

public class J05042_BangXepHang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        ArrayList<SinhVienPtit> arr = new ArrayList<>();
        while (t-->0) {
            sc.nextLine();
            String name = sc.nextLine();
            int cor = sc.nextInt();
            int sub = sc.nextInt();
            arr.add(new SinhVienPtit(name,cor,sub));
        }
        Collections.sort(arr);
        for (SinhVienPtit i : arr) {
            System.out.println(i);
        }
    }
}
