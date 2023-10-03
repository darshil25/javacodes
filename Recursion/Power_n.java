public class Power_n {

    public static int power(int x, int n){
        if(n == 0){
            return 1;
        }
        return x * power(x, n-1);
    }

    public static void main(String[] args) {
        int x = 2;
        int n = 10;
        System.out.println(power(x,n));
    }
}
