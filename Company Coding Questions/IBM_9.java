public class IBM_9 {
    public static void main(String[] args) {
        String str = "abbba";

        int s = 0;
        int e = str.length() - 1;

        boolean res = false;
        while(s < e){
            if(str.charAt(s) == str.charAt(e)){
                res = true;
            }
            else{
                res = false;
            }
            s++;
            e--;
        }

        System.out.println(res);
    }
}
