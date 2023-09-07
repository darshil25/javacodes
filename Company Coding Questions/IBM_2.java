/*
1. Write a program to find HCF of two numbers by without using recursion.

Input format:

The first line contains any 2 positive numbers separated by space.

Output format:

Print the HCF of given two numbers.

Sample Input:

70 15

Sample Output:

5
 */

import java.util.Scanner;
public class IBM_2 {

    public static int hcf(int p, int q){
        while(p!=q){
            if(p > q){
                p = p - q;
            }
            else{
                q = q - p;
            }
        }
        return p;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println(hcf(n,m));
    }
}
