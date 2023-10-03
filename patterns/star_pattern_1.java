public class star_pattern_1 {
    public static void main(String args[]) {

        for (int line = 1; line <= 4; line++) {
            // inner loop showing one line printing
            for (int star = 1; star <= line; star++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
