
public class print_all_prime_in_range_using_function {

    public static boolean isPrime(int a) {
        if (a == 2) {
            return true;
        }

        for (int i = 2; i <= Math.sqrt(a); i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void PrimeInRange(int n) {
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void main(String args[]) {
        PrimeInRange(15);
    }
}
