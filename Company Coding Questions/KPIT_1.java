/*
Mr. Robot is making a website, in which there is a tab to create a password. As with other websites, there are rules so that the password gets complex and none can predict the password for another. So he gave some rules like:

– At least one numeric digit

– At Least one Small/Lowercase Letter

– At Least one Capital/Uppercase Letter

– Must not have space 

– Must not have slash (/)

– At least 6 characters

If someone inputs an invalid password, the code prints: “Invalid password, try again”.

Otherwise, it prints: “password valid”.

Input Format:

A line with a given string as a password

Output Format:

If someone inputs an invalid password, the code prints: “Invalid password, try again”.

Otherwise, it prints: “password valid”, without the quotation marks.

Constraints:

Number of characters in the given string <=10^9

Sample input 1: 

abjnlL09

Sample output 1: 

password valid

Sample input 2: 

jjnaskpk

Sample output 2: 

Invalid password, try again
*/

import java.util.Scanner;
public class KPIT_1 {

    public static void checkP(String str){
        int n = str.length();
        if(n<6){
            System.out.println("invalid");
            return;
        }
        int num = 0;
        int cap = 0;
        int smal = 0;
        for(int i=0; i<n; i++){
            if(str.charAt(i) == ' ' || str.charAt(i) == '/'){
                System.out.println("invalid");
                return;
            }
            if(str.charAt(i) >= 65 && str.charAt(i) <= 90) cap++;
            if(str.charAt(i) >= 97 && str.charAt(i) <= 112) smal++;
            if(str.charAt(i) >= 0 - '0' && str.charAt(i) <= 9 - '0') num++;
        }
        if(cap < 0 && smal<0 && num < 0){
            System.out.println("invalid");
            return;
        }
        else{
            System.out.println("Valid");
            return;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        checkP(s);
    }
}
