import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class KhachHang implements Comparable<KhachHang>{
    private String ma,ten;
    private int phong,tongtien;
    private long songay;

    public KhachHang(String ma, String ten, int phong, String ngayden[],String ngaydi[],int tien) {
        this.ma = ma;
        this.ten = ten;
        this.phong = phong;
        LocalDate nden = LocalDate.of(Integer.parseInt(ngayden[2]),Integer.parseInt(ngayden[1]),Integer.parseInt(ngayden[0]));
        LocalDate ndi = LocalDate.of(Integer.parseInt(ngaydi[2]),Integer.parseInt(ngaydi[1]),Integer.parseInt(ngaydi[0]));
        this.songay = ChronoUnit.DAYS.between(nden,ndi)+1;
        Character s = String.valueOf(phong).charAt(0);
        this.tongtien = tien;
        if (s.equals('1')) {
            this.tongtien+=25*this.songay;
        }
        else if (s.equals('2')) {
            this.tongtien+=34*this.songay;
        }
        else if (s.equals('3')) {
            this.tongtien+=50*this.songay;
        }
        else {
            this.tongtien+=80*this.songay;
        }
    }
    public int compareTo(KhachHang o1 ) {
        return this.tongtien<o1.tongtien?1:-1;
    }
    public String toString() {
        return this.ma + " " + this.ten + " " + String.valueOf(this.phong) + " " + String.valueOf(this.songay) + " " + String.valueOf(this.tongtien);
    }
}
public class J07051_TinhTienPhong {
    public static String ChuanHoa(String s) {
        s = s.trim();
        String ss[] = s.split("\\s+");
        String name = "";
        for (int i = 0 ;i <ss.length; i++) {
            name +=Character.toUpperCase(ss[i].charAt(0));
            for (int j = 1;j < ss[i].length(); j++) {
                name +=Character.toLowerCase(ss[i].charAt(j));
            }
            if (i!=ss.length-1) {
                name+=" ";
            }
        }
        return name;
    }
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("KHACHHANG.in"));
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<KhachHang> arr = new ArrayList<>();
        for (int i=1;i<=t;i++) {
            String ma = String.format("KH%02d",i);
            String name = sc.nextLine();
            int phong = Integer.parseInt(sc.nextLine());
            String n1 = sc.nextLine();
            String n2 = sc.nextLine();
            String ngayden[] = n1.split("/");
            String ngaydi[] = n2.split("/");
            int tien = Integer.parseInt(sc.nextLine());
            arr.add(new KhachHang(ma,ChuanHoa(name),phong,ngayden,ngaydi,tien));
        }
        Collections.sort(arr);
        for (KhachHang i : arr) {
            System.out.println(i);
        }
    }
}
