import java.io.FileNotFoundException;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class baitap13_Danhsachmonthi {
    static class monThi{
        private String ma,ten,hinhthuc;
        public monThi(String ma,String ten,String hinhthuc){
            this.ma = ma;
            this.ten = ten;
            this.hinhthuc = hinhthuc;
        }

        public String getMa() {
            return ma;
        }

        public String toString() {
            return ma + " " + ten + " " + hinhthuc;
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MONHOC.in"));
        ArrayList<monThi> arr = new ArrayList<>();
        while (sc.hasNext()) {
            monThi a = new monThi(sc.nextLine(),sc.nextLine(),sc.nextLine());
            int ok = 1;
            for (monThi i : arr) {
                if (i.getMa().equals(a.getMa())) {
                    ok=0;
                    break;
                }
            }
            if (ok==1) arr.add(a);
        }
        Collections.sort(arr, new Comparator<monThi>() {
            @Override
            public int compare(monThi o1, monThi o2) {
                return o1.getMa().compareTo(o2.getMa())>0?1:-1;
            }
        });
        for (monThi i : arr) {
            System.out.println(i);
        }
    }
}
