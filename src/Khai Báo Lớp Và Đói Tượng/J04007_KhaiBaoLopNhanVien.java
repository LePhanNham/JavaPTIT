import java.util.Scanner;

public class J04007_KhaiBaoLopNhanVien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String gender = sc.nextLine();
        String Date = sc.nextLine();
        String Address = sc.nextLine();
        String Code = sc.nextLine();
        String DateKy = sc.nextLine();
        System.out.println("00001 " + name + " " + gender + " " + Date + " " + Address + " " + Code + " " + DateKy);
    }
}
