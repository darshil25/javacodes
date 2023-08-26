/*
Given n friends, each one can remain single or can be paired up with some other friend. 
Each friend can be paired only once. Find out the total number of ways 
in which friends can remain single or can be paired up.

Eg
Input  : n = 3
Output : 4
Explanation:
{1}, {2}, {3} : all single
{1}, {2, 3} : 2 and 3 paired but 1 is single.
{1, 2}, {3} : 1 and 2 are paired but 3 is single.
{1, 3}, {2} : 1 and 3 are paired but 2 is single.
Note that {1, 2} and {2, 1} are considered same.
 */

import java.util.*;

public class Friends_Pairing {

    public static int ways(int n) {
        // base
        if (n == 1 || n == 2) {
            return n;
        }

        // choices
        // single
        int single = ways(n - 1);

        // pairing

        // pairchoices
        int pchoice = n - 1;
        // pairing ways
        int pways = ways(n - 2);
        int pairingT = pchoice * pways;

        int total = single + pairingT;
        return total;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(ways(n));
    }
}
