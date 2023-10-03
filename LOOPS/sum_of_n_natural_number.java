import java.util.*;

public class sum_of_n_natural_number {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of n :- ");

        int n = sc.nextInt();
        int sum = 0;
        int i = 1;
        
        while(i <= n){
            sum = sum + i;
            i++;
        }
        System.out.println("Your sum is : " + sum);
    }
}
