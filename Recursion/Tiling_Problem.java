/*
You have two types of tiles: a 2 x 1 domino shape and a tromino shape. You may rotate these shapes.

Given an integer n, return the number of ways to tile an 2 x n board. Since the answer may be very large, 
return it modulo 10^9 + 7.

In a tiling, every square must be covered by a tile. Two tilings are different if and only if there are two 
4-directionally adjacent cells on the board such that exactly one of the tilings has both squares occupied 
by a tile.

Input: n = 3
Output: 5

Input: n = 1
Output: 1
 */
import java.util.*;
public class Tiling_Problem {
    //written notes for logic
    public static int ways(int n){ //for floor size 2 x n
        //base case
        if(n == 0 || n == 1){
            return 1;
        }

        //kaam
        //vertical
        int verti = ways(n-1);

        //horizontally
        int horz = ways(n-2);

        int total = verti + horz;
        return total;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(ways(n));
    }
}
