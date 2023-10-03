import java.util.*;

public class M17Q1 {

    /*
     * public static int lowercase_count(String str){
     * int count = 0;
     * 
     * }
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string :");
        String str = sc.nextLine();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        System.out.println(count);
    }
}
