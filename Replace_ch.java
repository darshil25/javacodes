/*
Problem Statement

You are given a function,

Void *ReplaceCharacter(Char str[], int n, char ch1, char ch2);

The function accepts a string  ‘ str’ of length n and two characters ‘ch1’ and ‘ch2’ as its arguments . Implement the function to modify and return the string ‘ str’ in such a way that all occurrences of ‘ch1’ in original string are replaced by ‘ch2’ and all occurrences of ‘ch2’  in original string are replaced by ‘ch1’.

Assumption: String Contains only lower-case alphabetical letters.

Note:

Return null if string is null.
If both characters are not present in string or both of them are same , then return the string unchanged.
Example:

Input:
Str: apples
ch1:a
ch2:p
Output:
paales
Explanation:

‘a’ in original string is replaced with ‘p’ and ‘p’ in original string is replaced with ‘a’, thus output is paales.
 */

import java.util.*;
public class Replace_ch {

    public static String replace(String s, char a, char b){
        String result = "";
        for(int i=0; i<s.length();i++){
            if(s.charAt(i) == a){
                result = result + b;
            }
            else if(s.charAt(i) == b){
                result = result + a;
            }
            else{
                result = result + s.charAt(i);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String a = sc.next();
        String b = sc.next();
        char a1 = a.charAt(0);
        char a2 = b.charAt(0);
        System.out.println(replace(str, a1, a2));
    }
}
