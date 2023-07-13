import java.util.*;
public class Main
{
  public static void main (String[]args)
  {
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter no of tickets: ");
    int ticket = sc.nextInt();
    
    if(ticket<5 || ticket>40){
        System.out.println("You can book Minimum of 5 and Maximum of 40 Tickets");
    }
    
    String food, coupon, circle;
    double total = 0;
    double cost = 0;
    
    System.out.println("You want refreshments ? :  ");
    food = sc.next();
    System.out.println("You have coupon ? : ");
    coupon = sc.next();
    System.out.println("Choose which circle seats you want ? : ");
    circle = sc.next();
    
    if(circle.charAt(0) == 'k'){
        cost = cost+(ticket*75);
    }
    else if(circle.charAt(0) == 'q'){
        cost = cost+(ticket*150);
    }
    else{
        System.out.println("invalid input");
    }
    
    total = cost;
    if(ticket>20){
        cost = cost - (cost*0.1);
    }
    total = cost;
    if(coupon.charAt(0) == 'y'){
        cost = cost - (cost*(0.02));
    }
    total = cost;
    if(food.charAt(0) == 'y'){
        cost = cost + (ticket*50);
    }
    total = cost;
    
    System.out.println("total amount is " + total);
  }
}
