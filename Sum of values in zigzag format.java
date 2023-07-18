import java.util.Scanner;

public class Main
{   
    public static int zigzag(int a[][]){
        int frow = 0;
        int lrow = 0;
        int dig = 0;
        
        for(int i=0; i<a.length; i++){
            frow = frow + a[0][i];
            lrow = lrow + a[a.length - 1][i];
        }
        
        for(int i=1; i<a.length-1; i++){
            for(int j=a.length-1-i; j>0; j--){
                dig = dig + a[i][j];
                break;
            }
        }
        
        int sum = frow + lrow + dig;
        System.out.println(frow + " " + lrow + " " + dig);
        return sum;
        
    }
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
		int arr[][] = new int[n][n];
		for(int i=0; i<n; i++){
		    for(int j=0; j<arr[0].length; j++){
		        arr[i][j] = sc.nextInt();
		    }
		}
		System.out.print(zigzag(arr));
	}
}
