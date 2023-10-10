public class Sudoku {

    public static boolean isSafe(int arr[][], int row, int col, int digit){

        //3 condition to check

        //1.row
        for(int i=0; i<9; i++){
            if(arr[row][i] == digit){
                return false;
            }
        }

        //2.column
        for(int i=0; i<9; i++){
            if(arr[i][col] == digit){
                return false;
            }
        }

        //3.grid
        int srow = (row/3)*3;
        int scol = (col/3)*3;
        for(int i=srow; i<srow+3; i++){
            for(int j=scol; j<scol+3; j++){
                if(arr[i][j] == digit){
                    return false;
                }
            }
        }

        return true;
    }

    public static boolean sudokuSolver(int [][]arr, int row, int col){
        //base case
        if(row == 9){
            return true;
        }

        int nextrow = row;
        int nextcol = col+1;
        if(col+1 == 9){
            nextrow = row+1;
            nextcol = 0;
        }
        //resursion

        if(arr[row][col] != 0){
            return sudokuSolver(arr, nextrow, nextcol);
        }

        for(int i=1; i<=9; i++){
            if(isSafe(arr, row, col, i)){
                arr[row][col] = i;
                if(sudokuSolver(arr, nextrow, nextcol)){ //sultion exist
                    return true;
                }
                arr[row][col] = 0;
            }
        }
        return false;
    }

    public static void printSudoku(int arr[][]){
        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] sudokuGrid = {
            {5, 3, 0, 0, 7, 0, 0, 0, 0},
            {6, 0, 0, 1, 9, 5, 0, 0, 0},
            {0, 9, 8, 0, 0, 0, 0, 6, 0},
            {8, 0, 0, 0, 6, 0, 0, 0, 3},
            {4, 0, 0, 8, 0, 3, 0, 0, 1},
            {7, 0, 0, 0, 2, 0, 0, 0, 6},
            {0, 6, 0, 0, 0, 0, 2, 8, 0},
            {0, 0, 0, 4, 1, 9, 0, 0, 5},
            {0, 0, 0, 0, 8, 0, 0, 7, 9}
        };
        if(sudokuSolver(sudokuGrid, 0, 0)){
            printSudoku(sudokuGrid);
        }
        else{
            System.out.println("Solution not found");
        }
    }
}
