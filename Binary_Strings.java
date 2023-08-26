/*
Given a positive integer N, count all possible distinct binary strings of length N such that 
there are no consecutive 1’s.

Eg
Input:  N = 2
Output: 3
// The 3 strings are 00, 01, 10

Input: N = 3
Output: 5
// The 5 strings are 000, 001, 010, 100, 101
 */

import java.util.Scanner;
public class Binary_Strings {

    public static void printStrings(int n, int lastplace, String str){
        //base case
        if(n==0){
            System.out.println(str);
            return;
        }

        //work
        printStrings(n-1, 0, str+"0");
        if(lastplace == 0){
            printStrings(n-1, 1, str+"1");
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int lastplace = 0;
        String str = "";
        printStrings(n, lastplace, str);
    }
    
}
