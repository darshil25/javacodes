
public class Numbers_in_decreasing {

    public static void decrease(int n){
        if(n == 1){
            System.out.println(n);
            return;
        }
        System.out.print(n+" ");
        decrease(n-1);
    }
    public static void main(String[] args) {
        int n = 10;
        decrease(n);
    }
}