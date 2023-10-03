import java.util.*;

public class hollow_rectangle {

    public static void structure(int R, int C) {
        // outer loop
        for (int i = 1; i <= R; i++) {
            // inner col
            for (int j = 1; j <= C; j++) {
                if (i == 1 || i == R || j == 1 || j == C) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter row no : ");
        int row = sc.nextInt();

        System.out.print("Enter column no : ");
        int col = sc.nextInt();

        System.out.println("Here is Your Hollow Rectangle : ");

        structure(row, col);
    }
}