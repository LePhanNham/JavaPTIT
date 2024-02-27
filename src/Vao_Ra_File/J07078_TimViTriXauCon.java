package Vao_Ra_File;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class J07078_TimViTriXauCon {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("STRING.in"));
        int t = Integer.parseInt(sc.nextLine());
        while (t-->0) {
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();
            if (s1.length()>=s2.length()) {
                for (int i=0;i<s1.length()-s2.length()+1;i++) {
                    if (s1.substring(i,i+s2.length()).equals(s2)) {
                        System.out.print((i+1) + " ");
                    }
                }
            }
            System.out.println();
        }
    }
}
