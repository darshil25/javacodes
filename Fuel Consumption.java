import java.text.*;
import java.util.*;
public class Main
{
	public static void main(String[] args){
	  Scanner sc = new Scanner(System.in);
	  DecimalFormat df2 =new DecimalFormat("0.00");
	  
	  System.out.println("Enter fuel quantity in Litre");
	  int fuel = sc.nextInt();
	  double f = fuel*(1.00);
	  
	  System.out.println("Enter distance covered in km");
	  int distance = sc.nextInt();
	  double d = distance*(1.00);
	  
	  if(f < 1 || d < 1){
	      System.out.println("invalid input");
	      System.exit(0);
	  }
	  
	  double cost = ((f/d)*100);
	  System.out.print("cost would be  ");
	  System.out.println(df2.format(cost));
	  
	  double mile = (d*0.6214);
	  double gallon = (f*0.2642);
	  double cos = (mile/gallon);
	  System.out.print("Cost in m/g is ");
	  System.out.println(df2.format(cos));
	}

}
