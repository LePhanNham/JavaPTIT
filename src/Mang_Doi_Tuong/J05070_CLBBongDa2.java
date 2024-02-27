
package Mang_Doi_Tuong;

        import java.util.*;


class DoiBong2 implements Comparable<DoiBong2>{
    private String ma,ten,id;
    private int soluong,giave;
    public DoiBong2(String ma, String ten, int giave) {
        this.ma = ma;

        this.ten = ten;
        this.giave = giave;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getMa() {
        return ma;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }
    public int compareTo(DoiBong2 o1) {

        if (this.giave*this.soluong == o1.giave*o1.soluong) {
            return this.ten.compareTo(o1.ten);
        }
        return this.giave*this.soluong<o1.giave*o1.soluong ? 1 : -1;
    }


    @Override
    public String toString() {
        return ma + " " + ten + " " + (long)giave*soluong;
    }


}

public class J05070_CLBBongDa2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<DoiBong2> arr = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        while (t-->0) {
            String ma = sc.nextLine();
            String name = sc.nextLine();
            int sl = Integer.parseInt(sc.nextLine());
            arr.add(new DoiBong2(ma,name,sl));
        }
        int q = Integer.parseInt(sc.nextLine());
        while (q-->0){
            String ma2 = sc.next();
            String id2 = ma2.substring(1,3);
            int sl2 = Integer.parseInt(sc.next());
            for (DoiBong2 i : arr) {
                if (i.getMa().equals(id2)) {
                    i.setMa(ma2);
                    i.setSoluong(sl2);
                    break;
                }
            }

        }
        Collections.sort(arr);
        for (DoiBong2 i : arr) {
            System.out.println(i);
        }
    }
}

//2
//AC
//AC Milan
//12
//MU
//Manchester United
//10
//2
//IAC1 80000
//EMU2 60000
