public class M20Q4 {

    public static int subS(String s, int i, int n){
        if(i == n){
            return 1;
        }
        int count = 0;
        count = count+subS(s, i, n-1);

        if(s.charAt(n) == s.charAt(i)){
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        String s = "abcab";
        int n = s.length();
        System.out.println(subS(s, 0, n-1));
    }
}
