public class Exponential {
    public static int FasExp(int a, int n) {
        int ans = 1;
        while(n>0){
            if((n&1)!=0){//Checking LSB
                ans = ans*a;
            }
            a=a*a;
            n=n>>1;
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(FasExp(3, 5));
    }
}