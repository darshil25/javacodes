/*
 * Rahul copies in the exam from his adjacent students. But he doesn’t want to be caught, so he changes words keeping the letter constant. That means he interchanges the positions of letters in words. You are the examiner and you have to find if he has copied a certain word from the one adjacent student who is giving the same exam, and give Rahul the markings he deserves.

Note that: Uppercase and lowercase are the  same.

Input Format:

First line with the adjacent student’s word

Second line with Rahul’s word

Output Format:

0 if not copied

1 if copied

Constraints:

1<=Length of string<=10^6

Sample Input:

CAR

ACR

Sample Output:

1
 */

import java.util.*;

public class KPIT_2 {

    public static int plagrism(String s, String t) {
        s = s.toUpperCase();
        t = t.toUpperCase();
        /* Approach 1 
        int same = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < t.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    same++;
                }
            }
        }
        if (same == s.length()) {
            return 1;
        } else {
            return 0;
        }
        */

        //APPROACH 2
        char s1[] = s.toCharArray();
        char t1[] = s.toCharArray();
        Arrays.sort(s1);
        Arrays.sort(t1);
        String a = new String(s1);
        String b = new String(t1);
        if(a.equals(b)){
            return 1;
        }
        else{
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        System.out.println(plagrism(s1, s2));
    }
}
