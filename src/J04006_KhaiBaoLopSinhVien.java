import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class J04006_KhaiBaoLopSinhVien {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String lop = sc.next();
        String ngay = sc.next();
        Double gpa = sc.nextDouble();
        Date ngay2 = new SimpleDateFormat("dd/MM/yyyy").parse(ngay);
        System.out.println("B20DCCN001 " + name + " " + lop + " " + new SimpleDateFormat("dd/MM/yyyy").format(ngay2) + " " + String.format("%.2f",gpa));
    }
}
