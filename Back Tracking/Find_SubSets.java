public class Find_SubSets {

    public static void subSet(String s, String ans, int i) {

        // base case
        if (i == s.length()) {
            if (ans.length() == 0) {
                System.out.println("null set");
            } else {
                System.out.println(ans);
            }
            return;
        }

        // recursion
        // Choice = yes
        subSet(s, ans + s.charAt(i), i + 1);

        // choice = no
        subSet(s, ans, i + 1);
    }

    public static void main(String[] args) {
        String s = "abc";
        String ans = "";
        subSet(s, ans, 0);
    }
}
