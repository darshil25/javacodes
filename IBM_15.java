/*
FIND A NUM IS PALINDROME OR NOT
 */

public class IBM_15 {
    public static void main(String[] args) {
        int a = 14541;
        int x = a;
        int y = a;
        int n = 0;
        while(x > 0){
            x = x / 10;
            n++;
        }
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            int res = a % 10;
            arr[i] = res;
            a = a/10;
        }
        int rev = 0;
        for(int i=0; i<n; i++){
            rev = (int) (rev + (arr[i] * Math.pow(10, n-1-i)));
        }

        if(rev == y){
            System.out.println("same");
        }
        else{
            System.out.println("not same");
        }
    }
}
