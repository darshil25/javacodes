import java.util.*;
public class Main
{
  public static void main (String[]args)
  {
    Scanner sc = new Scanner (System.in);
    int a = sc.nextInt ();
    int b = sc.nextInt ();
    int n = 0;

    if (a <= 0 || b <= 0 || a >= b)
      {
	System.out.println ("Provide valid input");
      }
    for (int i = a; i < b; i++)
      {
	if (i == 2)
	  {
	    System.out.print (a + " ");
	    continue;
	  }
	if (i == 1)
	  {
	    i++;
	  }
	if (i % 2 == 1)
	  {
	    System.out.print (i + " ");
	  }
      }
  }
}
