import java.util.*;

public class income_tax_calculator{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in); 

        System.out.println("Please enter your current income :- ");

        int income = sc.nextInt();
        int tax ;

        if(income<500000){
            tax = 0;
        }
        else if (income>=500000 && income<1000000){
            tax = (int) (income*0.2);
            income = income - tax;
        }
        else{
            tax = (int) (income*0.3);
            income = income - tax;
        }
        
        System.out.println("Your tax is " + tax);
        System.out.println("Your income after tax is " + income);
        
    }
}
