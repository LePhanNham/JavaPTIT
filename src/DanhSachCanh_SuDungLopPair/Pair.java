package DanhSachCanh_SuDungLopPair;

public class Pair<S,T>{
    private S x;
    private T y;

    public Pair(S x, T y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "(" + String.valueOf(x) + "," + String.valueOf(y) + ")";
    }
}
