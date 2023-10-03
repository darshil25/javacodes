public class product_of_a_and_b_functions {

    public static int multiplication(int a, int b) {
        int product = a * b;
        return product;
    }

    public static void main(String args[]) {
        int a = 7;
        int b = 9;
        int p = multiplication(a, b);
        System.out.println("Product of 7 and 9 is " + p);
    }
}
