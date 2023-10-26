
import java.util.Scanner;
import java.util.Calendar;

public class Sinhvien1 {
    //thuoc tinh
    private String ma,ten;
    private int tuoi;
    private boolean gtinh;
    private double diem1,diem2;
    //ham tao
    //defauft contructor

    public Sinhvien1() {
    }
    private class Diem{
        
    } 
    public Sinhvien1(String ma, String ten, int tuoi, 
            boolean gtinh, double diem1, double diem2) {
        this.ma = ma;
        this.ten = ten;
        this.tuoi = tuoi;
        this.gtinh = gtinh;
        this.diem1 = diem1;
        this.diem2 = diem2;
        
    }

    public Sinhvien1(String ma) {
        this.ma = ma;
        
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public boolean isGtinh() {
        return gtinh;
    }

    public void setGtinh(boolean gtinh) {
        this.gtinh = gtinh;
    }
    public int getNamSinh(){
        Calendar c=Calendar.getInstance();
        int y=c.get(Calendar.YEAR);
        return (y-tuoi);
    }
    public double getDiem1() {
        return diem1;
    }

    public void setDiem1(double diem1) {
        this.diem1 = diem1;
    }

    public double getDiem2() {
        return diem2;
    }

    public void setDiem2(double diem2) {
        this.diem2 = diem2;
    }

    public double getGpa() {
        return (diem1*3+diem2)/4;
    }

    
    
     public void input(){
         Scanner sc=new Scanner(System.in);
         //nhap thoi
         System.out.print("ma:");
         ma=sc.next();
         sc.nextLine();//
         System.out.print("ten:");
         ten=sc.nextLine();
         System.out.print("tuoi:");
         tuoi=sc.nextInt();
         System.out.print("Gioi tinh:");
         gtinh=sc.nextBoolean();
         System.out.print("Diem 1:");
         diem1=sc.nextDouble();
         System.out.print("Diem 2:");
         diem2=sc.nextDouble();
     }
    
    
    //viet ra
    @Override
    public String toString(){
        return ma+"\t"+ten+"\t"+tuoi+"\t"+(gtinh?"Nam":"Nu")+"\t"+getGpa();
    }

//    @Override
//    public String toString() {
//        return "Sinhvien1{" + "ma=" + ma + ", ten=" + ten + ", tuoi=" + tuoi + ", gtinh=" + gtinh + ", diem1=" + diem1 + ", diem2=" + diem2 + ", gpa=" + gpa + '}';
//    }
}
class GiaoVien{
    
}
