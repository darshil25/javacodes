import java.util.*;

public class TwoD_array_creation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Creating 2D-matrix
        int matrix[][] = new int[2][3];// [2] shows row numbers & [3]shows column numbers

        // giving input to matrix
        int n = 2, m = 3;

        // loop for each row
        for (int i = 0; i < n; i++) {
            // loop for colum in each row
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // printing matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }
}