import java.util.*;

public class M12Q5 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter an integer : ");
        int num = sc.nextInt();

        System.out.println("The sum of integer in " + num + " is " + sumofint(num));
    }

    public static int sumofint(int n) {
        int number = n;
        int sum = 0;

        while (number > 0) {
            int lastd = number % 10;
            sum = sum + lastd;
            number = number / 10;
        }
        return sum;
    }
}
