public class rohmbus_rectangle {

    public static void rohmbus(int n) {

        for (int i = 1; i <= n; i++) {
            // spaces = n-i
            for (int j = 1; j <= (n - i); j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        rohmbus(5);
    }
}
