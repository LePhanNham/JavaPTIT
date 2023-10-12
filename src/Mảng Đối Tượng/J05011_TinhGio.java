import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

class GameThu implements Comparable<GameThu>{
    private String ma,ten;
    private int thoigian;

    public GameThu(String ma, String ten, String gio1[], String gio2[]) {
        this.ma = ma;
        this.ten = ten;
        this.thoigian = Integer.parseInt(gio1[0])*60+Integer.parseInt(gio1[1])-Integer.parseInt(gio2[0])*60 - Integer.parseInt(gio2[1]);


    }

    public int compareTo(GameThu o1) {
        return -(this.thoigian-o1.thoigian);
    }

    public String toString() {
        return this.ma + " " + this.ten + " " + String.valueOf(this.thoigian/60) + " gio " + String.valueOf(this.thoigian%60) + " phut";
    }


}
public class J05011_TinhGio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<GameThu> arr = new ArrayList<>();
        int t = sc.nextInt();
        sc.nextLine();
        while (t-->0) {
            String ma = sc.nextLine();
            String ten = sc.nextLine();
            String gio1 = sc.nextLine();
            String gio2 = sc.nextLine();
            String tgian1[] = gio1.split(":");
            String tgian2[] = gio2.split(":");
            arr.add(new GameThu(ma,ten,tgian2,tgian1));
        }
        Collections.sort(arr);
        for (GameThu i : arr) {
            System.out.println(i);
        }
    }
}
//3
//01T
//Nguyen Van An
//09:00
//10:30
//06T
//Hoang Van Nam
//15:30
//18:00
//02I
//Tran Hoa Binh
//09:05
//10:00