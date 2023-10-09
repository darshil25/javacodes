public class N_Quenns_AllSol {
    public static void printBoard(char a[][]) {
        System.out.println("----- Chess Board -----");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean safe(char [][]arr, int r, int c){
        //vertically up
        for(int i=r-1; i>=0; i--){
            if(arr[i][c] == 'Q'){
                return false;
            }
        }

        //diagonally right up
        for(int i=r-1, j=c-1; i>=0 && j>=0; i--, j--){
            if(arr[i][j] == 'Q'){
                return false;
            }
        }

        //diagonally left up
        for(int i=r-1, j=c+1; i>=0 && j<arr.length; i--, j++){
            if(arr[i][j] == 'Q'){
                return false;
            }
        }
        return true;
    }

    public static void nQueens(char arr[][], int row){
        //base case
        if(row == arr.length){
            printBoard(arr);
            return;
        }

        //resursion
        for(int i=0; i<arr.length; i++){
            if(safe(arr, row, i)){
                arr[row][i] = 'Q';
                nQueens(arr, row+1);
                arr[row][i] = 'x';
            }
        }
    }

    public static void main(String[] args) {
        int n = 7;
        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = 'x';
            }
        }
        nQueens(board, 0);
    }
}
