public class Numbers_in_inreasing {

    public static void increase(int n){
        if(n == 1){
            System.out.print(1+" ");
            return;
        }
        increase(n-1);
        System.out.print(n+" ");
    }
    public static void main(String[] args) {
        int n = 10;
        increase(n);
    }

    //2nd method
    // public static void inrease(int m, int n){ 
    //     if(m == n){
    //         System.out.println(m);
    //         return;
    //     }
    //     System.out.print(m+" ");
    //     decrease(m+1, n);
    // }
    // public static void main(String[] args) {
    //     int m = 1;
    //     int n = 10;
    //     inrease(m, n);
    // }
}



    

