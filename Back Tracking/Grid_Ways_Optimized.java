public class Grid_Ways_Optimized {

    public static int permutation(int n){
        if(n==1){
            return 1;
        }
        return n*permutation(n-1);
    }
    public static int gridways(int n, int m){

        int w1 = permutation(n-1); //for down
        int w2 = permutation(m-1); //for right

        return ((permutation(w1+w2))  / (permutation(w1)*permutation(w2)));
    }
    public static void main(String[] args) {
        int n = 3, m = 3;
        System.out.println(gridways( n, m));
    }
}