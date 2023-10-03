import java.util.*;
public class M10Q2 { 
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    int n;
    int oddnum = 0;
    int evennum = 0;
    int choice;

    do {
        System.out.println("Enter a number : ");
        n = sc.nextInt();

        if(n % 2 == 0){
            evennum =+ n;
        }
        else{
            oddnum =+ n;
        }

        System.out.println("Wanna Continue ? 1 - yes and 0 - no");
        choice = sc.nextInt();

    } while (choice == 1);

    System.out.println("Sum of even number is " + evennum);
    System.out.println("Sum of odd number is " + oddnum);


    }
}