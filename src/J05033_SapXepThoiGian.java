import java.util.*;

class Tgian {
    private int gio,phut,giay;

    public Tgian(int gio, int phut, int giay) {
        this.gio = gio;
        this.phut = phut;
        this.giay = giay;
    }

    public int getGio() {
        return gio;
    }

    public int getPhut() {
        return phut;
    }

    public int getGiay() {
        return giay;
    }
}
public class J05033_SapXepThoiGian {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Tgian> lst = new ArrayList<>();
        int t = sc.nextInt();
        while (t-->0 ) {
            int gio = sc.nextInt();
            int phut = sc.nextInt();
            int giay = sc.nextInt();
            Tgian r = new Tgian(gio,phut,giay);
            lst.add(r);

        }
        Collections.sort(lst, new Comparator<Tgian>() {
            @Override
            public int compare(Tgian o1, Tgian o2) {
                if (o1.getGio()!=o2.getGio()) {
                    return Integer.compare(o1.getGio(),o2.getGio());
                }
                else if (o1.getPhut()!=o2.getPhut()){
                    return Integer.compare(o1.getPhut(),o2.getPhut());
                }
                else return Integer.compare(o1.getGiay(),o2.getGiay());
            }
        });
        for (Tgian i : lst) {
            System.out.println(i.getGio() + " " + i.getPhut() + " " + i.getGiay());
        }
    }
}
