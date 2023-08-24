
public class Power_n_Optimizedjava {

    public static int optimized(int n, int x){
        if(x == 0){
            return 1;
        }
        int opr = optimized(n, x/2);
        int work = opr * opr;
        if(x%2 != 0){
            work = n * work;
        }
        return work;
    }
    public static void main(String[] args) {
        int n = 2;
        int x = 10;
        System.out.println(optimized(n, x));
    }
}