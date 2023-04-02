public class CountSetBits {
    public static int CountSet(int n){
        int count = 0;
        while(n>0){
            if((n&1)!=0){//checks value of LSB
                count++;
            }
            n = n>>1;
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(CountSet(16));
    }
}
