import java.util.*;

public class search_in_2darray {

    public static boolean search(int mat[][], int key) {
        int n = mat.length;
        int m = mat[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (mat[i][j] == key) {
                    System.out.println(key + " found at position (" + i + 1 + ", " + j + 1 + ")");
                    return true;
                }
            }
        }
        return false;
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
        System.out.println("enter key : ");
        int key = sc.nextInt();

        search(matrix, key);
    }
}
