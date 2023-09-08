//Write a program to reverse digits of a number

public class IBM_8 {
    public static void main(String[] args) {
        int n = 7459867;
        int rev = 0;
        while(n > 0){
            rev = (rev*10) + n % 10;
            n = n/10;
        }
        System.out.println(rev);
    }
}
