public class inverted_half_pyramid_numbers {

    public static void pyramid(int n) {
        // row
        for (int i = 1; i <= n; i++) {
            // numbers
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(j);
            }
            // spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        pyramid(5);
    }
}
