import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
class Nhanvien {
    private String name,ngaysinh;
    private double diemlt,diemth,diemtb;

    public Nhanvien(String name, String ngaysinh, double diemlt, double diemth) {
        this.name = name;
        this.ngaysinh = ngaysinh;
        this.diemlt = diemlt;
        this.diemth = diemth;
    }
    private String ChuanHoa(String s) {
        String token[] = s.trim().split("\\s+");
        String ten = "";
        for (int i=0;i<token.length;i++) {
            ten+=Character.toUpperCase(token[i].charAt(0));
            for (int j=0;j<token[i].length();j++) {
                ten+=Character.toLowerCase(token[i].charAt(j));
            }
            if (i!= token.length-1) ten+=" ";
        }
        return ten;
    }

}
public class J07053_XetTuyen {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("XETTUYEN.in"));
        int t = Integer.parseInt(sc.nextLine());

    }
}
