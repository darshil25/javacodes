/*
java Program to generate Fibonacci Triangle
*/
public class IBM_4 {
    public static void main(String[] args) {
        int n = 10;
        int a = 0;
        int b = 1;
        System.out.print(a + " " + b + " ");
        while (n != 0) {
            int sum = 0;
            sum = a + b;
            System.out.print(sum + " ");
            a = b;
            b = sum;
            n--;
        }
    }
}
