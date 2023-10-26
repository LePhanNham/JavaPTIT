//import java.util.Scanner;
//
//class GiaoVien{
//    private String CV,ten;
//    private int luong;
//
//    public GiaoVien(String CV, String ten, int luong) {
//        this.CV = CV;
//        this.ten = ten;
//        this.luong = luong;
//    }
//
//    public String getCV() {
//        return CV;
//    }
//    public String getPC() {
//        return CV.substring(0,2);
//    }
//    public String getHS() {
//        return CV.substring(2);
//    }
//    public String getTen() {
//        return ten;
//    }
//
//    public int getLuong() {
//        return luong;
//    }
//}
//public class J04015_TinhThuNhapGiaoVien {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String ma = sc.nextLine();
//        String name = sc.nextLine();
//        int luong = sc.nextInt();
//        GiaoVien r = new GiaoVien(ma,name,luong);
//        int phucap;
//        if (r.getPC().equals("HT")) {
//            phucap = 2000000;
//        }
//        else if (r.getPC().equals("HP")) {
//            phucap = 900000;
//        }
//        else {
//            phucap = 500000;
//        }
//        int thunhap = phucap + luong*Integer.parseInt(r.getHS());
//        System.out.println(r.getCV() + " " + r.getTen() + " " + Integer.parseInt(r.getHS()) + " " +phucap + " " + thunhap);
//    }
//}
