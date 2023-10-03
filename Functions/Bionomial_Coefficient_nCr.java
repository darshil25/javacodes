import java.util.*;

public class Bionomial_Coefficient_nCr {

    public static int factorial(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f *= i;
        }
        return f;
    }

    public static int bioCoeff(int n, int r) {
        int n_fact = factorial(n);
        int r_fact = factorial(r);
        int n_minus_r_fact = factorial(n - r);
        int B_C = n_fact / (r_fact * n_minus_r_fact);

        return B_C;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of a : ");
        int a = sc.nextInt();
        System.out.println("Enter value of b : ");
        int b = sc.nextInt();
        int ans = bioCoeff(a, b);

        System.out.println(a + " factorial " + b + " is " + ans);

    }
}