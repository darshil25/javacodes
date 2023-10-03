import java.util.*;
public class Sumofab{
    public static void main(String args[]){
        System.out.println("Please input first number");
        Scanner dt = new Scanner(System.in);
        int a = dt.nextInt();
        System.out.println("Please input Second number");
        int b = dt.nextInt();
        int sum = a+b;
        System.out.print("Your sum is : ");
        System.out.print(sum);
    }
}