import java.util.Scanner;
public class Fibonacci {

    public static int fibo(int n){
        if(n == 0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        int result = fibo(n-1) + fibo(n-2);
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fibo(n));
    }
}
