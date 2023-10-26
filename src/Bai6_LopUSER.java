import java.util.*;

class User {
    private String username,password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

}
public class Bai6_LopUSER {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        ArrayList<User> arr = new ArrayList<>();
        ArrayList<User> arr2 = new ArrayList<>();

        while (t-->0) {
            String name= sc.next(),pass = sc.next();
            arr.add(new User(name,pass));
        }
        int t2 = sc.nextInt();
        while (t2-->0) {
            String name2 = sc.next();
            String pass2 = sc.next();
            User r = new User(name2,pass2);
            if (arr.contains(r)) {
                arr2.add(r);
            }
        }
        for (User i : arr2) {
            System.out.println(Collections.frequency(arr2,i));
            arr2.remove(i);
        }
    }
}
//4
//tendangnhap matkhau
//username password
//nguoidung m4tkh4un4yr4tb40m4t
//user2 password
//6
//tendangnhap matkhau
//username matkhau
//bfc34 contest
//username password
//tendangnhap matkhau
//user2 password