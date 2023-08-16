/*
Implement the following functions.a

char*MoveHyphen(char str[],int n);

The function accepts a string “str” of length ‘n’, that contains alphabets and hyphens (-). Implement the function to move all hyphens(-) in the string to the front of the given string.

NOTE:- Return null if str is null.

Example :-

Input:
str.Move-Hyphens-to-Front
Output:
—MoveHyphenstoFront
Explanation:-

The string “Move-Hyphens -to-front” has 3 hyphens (-), which are moved to the front of the string, this output is “— MoveHyphen”

Sample Input

Str: String-Compare
Sample Output-

-StringCompare
 */

import java.util.*;

public class Move_Hyphen {

    public static String moveHyphen(String s){
        int h = 0;
        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i) == '-'){
                h++;
            }
        }
        
        StringBuilder sb = new StringBuilder();

        while(h>0){
            sb.append('-');
            h--;
        }
        s = s.replace("-", "");
        sb.append(s);
        String newS = sb.toString();
        return newS;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(moveHyphen(str));
    }
}
