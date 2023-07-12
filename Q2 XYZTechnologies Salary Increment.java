import java.text.*;
import java.util.*;
public class Main
{
  public static void main (String[]args)
  {
    Scanner sc = new Scanner (System.in);

      System.out.println ("Enter Salary");
    int sal = sc.nextInt ();

      System.out.println ("enter rating");
    float rating = sc.nextFloat ();
    int newSal = 0;

    if (rating >= 1 && rating <= 3)
      {
	newSal = sal + (sal / 10);
      }
    else if (rating >= 3.1 && rating <= 4)
      {
	newSal = sal + (sal / 4);
      }
    else if (rating >= 4.1 && rating <= 5)
      {
	newSal = sal + ((sal * 30) / 100);
      }

    System.out.println (newSal);
  }
}
