import java.util.Scanner;

public class IBM_7 {

    public static void check(int n) {
        boolean ans = false;
        if (n % 4 == 0) {
            ans = true;
                if (n % 400 == 0) {
                    ans = true;
                }
        }
        System.out.println(ans); ;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        check(n);
    }
}
