import java.util.*;

public class M10Q3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please input number : ");
        int n = sc.nextInt();
        if (n >= 0) {
            int fact = 1;

            for (int i = n; i >= 1; i--) {
                fact *= i;
            }
            System.out.println(n + " factorial = " + fact);
        } else {
            System.out.println("Factorial not exist for given input");
        }

    }
}
