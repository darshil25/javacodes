import java.util.*;
public class ifelse {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Insert your age :- ");
        int age = sc.nextInt();
        
        if(age>=18){
            System.out.println("You are adult");
        }
        if(age>15 && age<18){
            System.out.println("You can drive Activa but You are not adult");
        }
        else{
            System.out.println("You are not adult");
        }
    }
}
