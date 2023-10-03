import java.util.*;
public class M20Q2 {

    static String numbers[] = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

    public static void words(int n){
        if(n == 0){
            return;
        }

        int ld = n % 10;
        words(n/10);
        System.out.print(numbers[ld] + " ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        words(n);
    }
}
