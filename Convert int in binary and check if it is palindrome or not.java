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
