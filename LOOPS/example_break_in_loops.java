import java.util.*;

public class example_break_in_loops {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        /*do {
            System.out.println("Enter number : ");
            int n = sc.nextInt();
            if(n % 10 == 0){
                break;
            }
            System.out.println(n);
        } while (true);
        */
        

        while(true){
            int n = sc.nextInt();
            if(n % 10 == 0){
                break;
            }
            System.out.println(n);
            
        }
        
    }
}
