public class Find_SubSets {

    public static void subSet(String s, String ans, int i){

        //base case
        if(i == s.length()){
            System.out.println(ans);
            return;
        }

        //recursion
        //Choice = yes
        subSet(s, ans+s.charAt(i), i+1);

        //choice = no
        subSet(s, ans, i+1);
    }
    public static void main(String[] args) {
        String s = "abc";
        String ans = "";
        int i=0;
        subSet(s, ans, i);
    }
}
