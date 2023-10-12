package J07017_LopPair;

public class Pair <T , S > {
    private T first;
    private S second;

    Pair(T first,S second) {
        this.first = first;
        this.second = second;
    }

    public String toString() {
        return this.first + " " + this.second;
    }

    private boolean check(Integer n) {
        for (int i=2;i<=Math.sqrt(n);i++) {
            if (n%i==0) return false;
        }
        return n>1;
    }

    public boolean isPrime() {
        return check((Integer) this.first) && check((Integer)this.second);
    }
}
