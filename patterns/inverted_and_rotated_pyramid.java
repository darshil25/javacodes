public class inverted_and_rotated_pyramid {

    public static void pyramid(int row) {
        // outer loop
        for (int i = 1; i <= row; i++) {
            // column printing spaces
            for (int j = 1; j <= row - i; j++) {
                System.out.print("  ");
            }
            // column printing stars
            for (int j = 1; j <= i; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        pyramid(4);
    }
}
