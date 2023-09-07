/*
Q2. Consider a string, S, that is a series of characters, each followed by its frequency as an integer. 
The string is not compressed correctly, so there may be multiple occurrences of the same character. 
A properly compressed string will consist of one instance of each character in alphabetical order followed by 
the total count of that character within the string.
 */

import java.util.Scanner;

public class IBM_3 {

    public static String compress(String str) {
        int n = str.length();
        StringBuilder sb = new StringBuilder();
        boolean charocc[] = new boolean[256];

        for (int i = 0; i < n - 1; i += 2) {
            if (!charocc[str.charAt(i)]) {
                int count = Character.getNumericValue(str.charAt(i + 1));
                sb.append(str.charAt(i));

                for (int j = i + 2; j < n; j += 2) {
                    if (str.charAt(i) == str.charAt(j)) {
                        count = count + Character.getNumericValue(str.charAt(j + 1));
                    }
                }

                sb.append(count);
                charocc[str.charAt(i)] = true;
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(compress(s));
    }
}
