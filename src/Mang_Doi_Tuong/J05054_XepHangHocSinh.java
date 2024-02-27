package Mang_Doi_Tuong;

import java.util.*;

class HocSinh {
    private String name,id,xl;
    private double diem;
    private int xephang;

    public HocSinh(String id,String name, double diem) {
        this.id = id;
        this.name = name;
        this.diem = diem;
        if (diem<5) {
            this.xl =  "Yeu";
        }
        else if (diem<7) {
            this.xl = "Trung Binh";
        }
        else if (diem<9) {
            this.xl = "Kha";
        }
        else this.xl = "Gioi";
    }

    public String getId() {
        return id;
    }

    public void setXephang(int xephang) {
        this.xephang = xephang;
    }

    public double getDiem() {
        return diem;
    }


    public String toString() {
        return id + " " + name + " " + diem + " " + this.xl + " " + this.xephang;
    }
}
public class J05054_XepHangHocSinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t  = Integer.parseInt(sc.nextLine());
        Map<Double,Integer> mp = new TreeMap<>();
        ArrayList<HocSinh> arr = new ArrayList<>();
        for (int i=1;i<=t;i++) {
            String ma = String.format("HS%02d",i);
            arr.add(new HocSinh(ma,sc.nextLine(),Double.parseDouble(sc.nextLine())));

        }
        for (int i=1;i<=t;i++) {
            mp.put(arr.get(i-1).getDiem(),0);
        }
        Collections.sort(arr, new Comparator<HocSinh>() {
            @Override
            public int compare(HocSinh o1, HocSinh o2) {
                return o1.getDiem()<o2.getDiem()?1:-1;
            }
        });
        int top = 1;
        for (int i=0;i<arr.size();i++) {
            if (i==0 || arr.get(i).getDiem()==arr.get(i-1).getDiem()) {
                arr.get(i).setXephang(top);
            }
            else {
                arr.get(i).setXephang(i+1);
                top=i+1;
            }
        }
        Collections.sort(arr, new Comparator<HocSinh>() {
            @Override
            public int compare(HocSinh o1, HocSinh o2) {
                return o1.getId().compareTo(o2.getId());
            }
        });
        for (HocSinh i : arr) {
            System.out.println(i);
        }
    }
}


//3
//Tran Minh Hieu
//5.9
//Nguyen Bao Trung
//8.6
//Le Hong Ha
//9.2
