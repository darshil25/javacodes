import java.util.*;

public class one_to_n_while_loop {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Input a number");
        int n = sc.nextInt();
        int number = 1;

        while (number <= n) {
            System.out.println(number);
            number++;
        }

    }
}
