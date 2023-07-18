/*------------------ Difference between even ad odd position of integer ------------------*/

import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = String.valueOf(n);
		
	    int ev = 0;
	    int od = 0;
	    
	    for(int i=0; i<s.length(); i++){
	        if(i % 2 == 0){
	            od = od + s.charAt(i);
	        }
	        else{
	            ev = ev + s.charAt(i);
	        }
	    }
	    int diff = od - ev;
	    if(diff<0){
	        diff = diff * -1;
	    }
	    System.out.print(diff);
	}
}

/*----------------- Convert int in binary and check if it is palindrome or not -----------------*/

import java.util.*;

public class Main
{
    public static boolean palindrome(String s){
        int start = 0;
        int end = s.length()-1;
        while(start < end){
            if(s.charAt(start) == s.charAt(end)){
                start++;
                end--;
            }
            else{
                return false;
            }
            }
            return true;
        }
        
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String bin = Integer.toBinaryString(n);
		System.out.println(palindrome(bin));
	}
}
