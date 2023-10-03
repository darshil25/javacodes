/*
Given a string s, remove duplicate letters so that every letter appears once and only once. 

Example 1:

Input: s = "bcabc"
Output: "bca"


Example 2:
Input: s = "cbacdcbc"
Output: "cbad"
*/

import java.util.*;

public class Remove_Duplicates {

    public static void removeD(String s, int i, StringBuilder sb, boolean map[]){
        //Here we take sb and map in main function but we cannot take it in removeD.
        //because if we create that then at every iteraction of recursive function our ab and map will be
        //created as many times as recursive function work.
        //to prevent that we created those in main so that our values will be stored.

        //base case
        if(i == s.length()){
            System.out.println(sb);
            return;
        }
        char currCh = s.charAt(i); 

        //work
        if(map[currCh - 'a'] == true){
            removeD(s, i+1, sb, map);
        }
        else{
            //if ch's value in array is not true then we will assign it as true and add that ch in stringbuilder
            map[currCh - 'a'] = true;
            removeD(s, i+1, sb.append(currCh), map);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        StringBuilder sb = new StringBuilder();
        boolean map[] = new boolean[26];
        removeD(input, 0, sb, map);
    }
}
