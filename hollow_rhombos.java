public class hollow_rhombos {

    public static void hrohmbus(int n) {
        // line
        for (int i = 1; i <= n; i++) {
            // spaces
            for (int j = 1; j <= (n - i); j++) {
                System.out.print("  ");
            }

            // boundryline star + spaces
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        hrohmbus(7);
    }
}
