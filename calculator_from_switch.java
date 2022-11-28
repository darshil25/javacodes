import java.util.*;

public class calculator_from_switch {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.println("Please input a : ");
        int a = sc.nextInt();

        System.out.println("Please input b : ");
        int b = sc.nextInt();

        System.out.println("Please input operation :  ");
        char operator = sc.next().charAt(0);
        
        System.out.println("Your output is : ");
        switch (operator) {
            case '+' : System.out.println(a + b); break;
            case '-' : System.out.println(a - b); break;
            case '*': System.out.println(a * b); break;
            case '/' : System.out.println(a / b); break;
            case '%' : System.out.println(a % b); break;
            default : System.out.println("Please enter valid values"); 
        }
    }
}
