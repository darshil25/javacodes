import java.util.*;

public class M10Q4 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter number whose table you want to print : ");
        int n = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            int table = n * i;
            System.out.println(n + " * " + i + " = " + table);

        }
    }
}
