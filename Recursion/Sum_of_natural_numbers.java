public class Sum_of_natural_numbers {

    public static int naturalSum(int n){
        if(n==0){
            return 0;
        }
        int coun = naturalSum(n-1);
        int sum = n + naturalSum(n - 1);
        return sum;
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(naturalSum(n));
    }
}
