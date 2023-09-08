// Find GCD (Greatest Common Divisor) or HCF (Highest Common Factor) of two numbers is the largest number 
//that divides both of them.
import java.util.Scanner;

public class IBM_6 {

    public static int hcf(int n, int m){
        int result = Math.min(n, m);
        while(result > 0){
            if(n % result == 0 && m % result == 0){
                break;
            }
            result--;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println(hcf(n, m));
    }
}
