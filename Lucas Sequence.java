import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int a[] = new int[n];
	     for(int i = 0; i<3; i++){
            a[i] = sc.nextInt();
        }
        for(int i=3; i<n; i++){
            a[i] = a[i-3] + a[i-2] + a[i-1];
        }
        for(int i=0; i<n; i++){
            System.out.print(a[i] + " ");
        }
	}
}
