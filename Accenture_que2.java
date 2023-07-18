import java.util.*;

public class Main
{   
    public static int binstring(String s){
        if(s == null){
            return -1;
        }
        
        int res = s.charAt(0) - '0';
        for(int i=1; i<s.length();){
            char prev = s.charAt(i);
            i++;
            
            if(prev == 'A'){
                res = res & (s.charAt(i) - '0');
            }
            
            else if(prev == 'B'){
                res = res | (s.charAt(i) - '0');
            }
            
            else{
                res = res ^ (s.charAt(i) - '0');
            }
            i++;
        }
        return res;
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.print(binstring(str));
		
	}
}
