import java.util.*;

public class functions_sum {

    public static int SumCalculate(int num1, int num2) {
        int sum = num1 + num2;
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of a : ");
        int a = sc.nextInt();
        System.out.println("Enter value of b : ");
        int b = sc.nextInt();
        int sum = SumCalculate(a, b);
        System.out.println(sum);

    }
}