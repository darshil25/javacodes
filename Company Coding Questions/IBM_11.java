//Program to find LCM of two numbers

import java.util.Scanner;
public class IBM_11 {
    public static int lcm(int x, int y){
        int a = Math.max(x, y);
        while(true){
            if(a % x == 0 && a % y == 0){
                break;
            }
            a++;
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println(lcm(n,m));
    }
}
