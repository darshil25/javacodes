//Given a number x, determine whether the given number is Armstrong Number or not.
public class IBM_5 {
    public static void main(String[] args) {
        int x = 13;
        int m = x;
        int sum = 0;
        int n = (int) Math.log10(x) + 1;
        while (x > 0) {
            int p = x % 10;
            
            sum += (int) Math.pow(p, n);
            x = x / 10;
        }
        System.out.println((m == sum) ? "yes" : "no");
    }
}
