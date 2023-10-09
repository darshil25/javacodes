public class N_Quenns_count {

    public static boolean safe(char[][] arr, int r, int c) {
        // Vertically up
        for (int i = r - 1; i >= 0; i--) {
            if (arr[i][c] == 'Q') {
                return false;
            }
        }

        // Diagonally right up
        for (int i = r - 1, j = c - 1; i >= 0 && j >= 0; i--, j--) {
            if (arr[i][j] == 'Q') {
                return false;
            }
        }

        // Diagonally left up
        for (int i = r - 1, j = c + 1; i >= 0 && j < arr.length; i--, j++) {
            if (arr[i][j] == 'Q') {
                return false;
            }
        }
        return true;
    }

    public static void nQueens(char[][] arr, int row) {
        // Base case
        if (row == arr.length) {
            count++;
            return;
        }

        // Recursion
        for (int i = 0; i < arr.length; i++) {
            if (safe(arr, row, i)) {
                arr[row][i] = 'Q';
                nQueens(arr, row + 1);
                arr[row][i] = 'x';
            }
        }
    }

    static int count = 0;

    public static void main(String[] args) {
        int n = 4;
        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = 'x';
            }
        }
        nQueens(board, 0);
        System.out.println(count);
    }
}
