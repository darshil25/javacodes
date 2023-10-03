import java.util.Arrays;

public class M17Q4 {

    public static void main(String[] args) {
        String str1 = "race";
        String str2 = "oare";

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        if (str1.length() == str2.length()) {
            char[] str1charArray = str1.toCharArray();
            char[] str2charArray = str2.toCharArray();
            Arrays.sort(str1charArray);
            Arrays.sort(str2charArray);
            boolean results = Arrays.equals(str1charArray, str2charArray);
            if (results) {
                System.out.println("anagrams");
            } else {
                System.out.println("not anagrams");
            }
        } else {
            System.out.println("not anagrams");
        }

    }
}
