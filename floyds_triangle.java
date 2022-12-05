public class floyds_triangle {

    public static void triangle(int n) {
        int counter = 1;
        // outerloop
        for (int i = 1; i <= n; i++) {
            // innerloop - counter var
            for (int j = 1; j <= i; j++) {
                System.out.print(counter + " ");
                counter++;
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        triangle(5);
    }
}
