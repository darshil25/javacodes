import java.util.*;

public class factorial_in_function {

    public static int factorial(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f *= i;
        }
        return f;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int a = sc.nextInt();
        int fact = factorial(a);
        System.out.println(a + "! = " + fact);
    }
}
