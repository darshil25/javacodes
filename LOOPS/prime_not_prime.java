import java.util.*;

public class prime_not_prime {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        boolean isPrime = true;

        for (int i = 2; i <= Math.sqrt (n); i++){
            if (n % i == 0) { // if n is divided by i then it will become non prime
                isPrime = false;
            }
        }

        if (isPrime == true) {
            System.out.println(n + "is Prime");
        } else {
            System.out.println(n + "is not Prime");
        }
    }
}
