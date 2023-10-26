import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
class Monhoc {
    private String ma,ten,gio;

    public Monhoc(String ma, String ten, String gio) {
        this.ma = ma;
        this.ten = ten;
        this.gio = gio;
    }

    public String getMa() {
        return ma;
    }

    public String getTen() {
        return ten;
    }

    public String getGio() {
        return gio;
    }
}
public class Bai10_TinhTongSoGioGiangDay {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MONHOC.in"));
        int t = sc.nextInt();
        sc.nextLine();
        ArrayList<String> arr = new ArrayList<>();
        while (sc.hasNextLine()) {
            String s[] = sc.nextLine().split(" ");
            arr.add(s[0]);
        }
        Scanner sc2 = new Scanner(new File("MONHOC.in"));
        int t2 = sc2.nextInt();
        sc.nextLine();
        ArrayList<String> arr2 = new ArrayList<>();
        ArrayList<String> arr3 = new ArrayList<>();
        while (sc2.hasNextLine()) {
            String s[] = sc2.nextLine().split(" ");
            arr2.add(s[0]);
            String name = "";
            for (int i=1;i<s.length-1;i++) {
                name+=s[i]+" ";
            }
            name+=s[s.length-1];
            arr3.add(name);
        }
        Scanner sc3 = new Scanner(new File("MONHOC.in"));
        int t3 = sc3.nextInt();
        sc3.nextLine();
        ArrayList<Monhoc> arr5 = new ArrayList<>();
        ArrayList<String> arr4 = new ArrayList<>();
        float sum[] = new float[10001];
        while (sc3.hasNextLine()) {

            String s[] = sc3.nextLine().split(" ");
            arr4.add(s[0]);
            int index = arr2.indexOf(s[0]);
            sum[index]+=Float.parseFloat(s[2]);
        }
        for (String i : arr4) {

        }
    }
}
