public class Decimal_to_binary_using_function {

    public static void D2B(int n) {
        int myNum = n;
        int binNum = 0;
        int pow = 0;
        while (n > 0) {
            int rem = n % 2;
            binNum = binNum + (rem * (int) Math.pow(10, pow));

            pow++;
            n = n / 2;
        }

        System.out.println("Binary num of " + myNum + " is " + binNum);
    }

    public static void main(String args[]) {
        D2B(7);
    }
}