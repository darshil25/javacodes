import java.util.*;

public class min_max_in_array {

    public static int max_ele(int mat[][]) {
        int n = mat.length;
        int m = mat[0].length;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (mat[i][j] > max) {
                    max = mat[i][j];
                }
            }
        }
        System.out.println("max value found in matrix is " + max);
        return max;
    }

    public static int min_ele(int mat[][]) {
        int n = mat.length;
        int m = mat[0].length;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (mat[i][j] < min) {
                    min = mat[i][j];
                }
            }
        }
        System.out.println("min value found in matrix is " + min);
        return min;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter row no : ");
        int n = sc.nextInt();
        System.out.println("enter column no : ");
        int m = sc.nextInt();

        int matrix[][] = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        min_ele(matrix);
    }
}
