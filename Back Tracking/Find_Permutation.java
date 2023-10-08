public class Find_Permutation {

    public static void permutation(String s, String ans){
        //base case
        if(s.length() == 0){
            System.out.println(ans);
            return;
        }

        //resursion --> O(N*N!)
        for(int i=0; i<s.length(); i++){
            char curr = s.charAt(i);
            String str = s.substring(0, i) /*make subS of element from index 0 to i-1 */ + s.substring(i+1, s.length()) /* make subS of element from index i+1 to length-1 */;
            permutation(str, ans+curr);
        }
    }
    public static void main(String[] args) {
        String s = "abc";
        String ans = "";
        permutation(s, ans);
    }
}
