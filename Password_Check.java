/*
You are given a function.
int CheckPassword(char str[], int n);
The function accepts string str of size n as an argument. Implement the function which returns 1 if given string str is valid password else 0.
str is a valid password if it satisfies the below conditions.

– At least 4 characters
– At least one numeric digit
– At Least one Capital Letter
– Must not have space or slash (/)
– Starting character must not be a number
Assumption:
Input string will not be empty.

Example:

Input 1:
aA1_67
Input 2:
a987 abC012

Output 1:
1
Output 2:
0
*/ 
import java.util.*;
import java.io.*;
public class Password_Check {

    public static int CheckPassword(char str[], int n){
        int result;
        boolean res = Character.isDigit(str[0]);

        if(n < 3 || res == true){
            return 0;
        }

        boolean number = false;
        boolean capLetter = false;

        for(int i=0; i<n; i++){
            if(str[i] == '/' || str[i] == ' '){
                return 0;
            }
            if(Character.isDigit(str[i])){
                number = true;
            }
            if(Character.isUpperCase(str[i])){
                capLetter = true;
            }
        }

        if(number && capLetter){
            result = 1;
        }
        else{
            result = 0;
        }
    
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        char str[] = input.toCharArray();
        int n = str.length;
        System.out.println(CheckPassword(str, n));

    }
}
