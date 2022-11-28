import java.util.*;

public class example_continue_in_loops {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        /*
         * while (true) {
         * System.out.print("Input number : ");
         * int n = sc.nextInt();
         * if (n % 10 == 0) {
         * continue;
         * }
         * System.out.println(n);
         * }
         */

        do {
            System.out.print("Input number : ");
            int n = sc.nextInt();

            if (n % 10 == 0) {
                continue;
            }
            System.out.println(n);

        } while (true);

    }
}
