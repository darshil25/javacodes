public class Spiral_Matrix {

    public static void Spiral_matrix(int mat[][]) {
        int srow = 0;
        int scol = 0;
        int erow = mat.length - 1;
        int ecol = mat[0].length - 1;

        while (srow <= erow && scol <= ecol) {
            // top layer printing
            // raw remain same, column changing
            for (int j = scol; j <= ecol; j++) {
                System.out.print(mat[srow][j] + " ");
            }

            // right layer printing
            // column remain same, row changing
            for (int i = srow + 1; i <= erow; i++) {
                System.out.print(mat[i][ecol] + " ");
            }

            // bottomlayer printing
            // raw remain same, column changing
            for (int j = ecol - 1; j >= scol; j--) {
                if (srow == erow) {
                    break;
                }
                System.out.print(mat[erow][j] + " ");
            }

            // left layer printing
            // column remain same, row changing
            for (int i = erow - 1; i >= srow + 1; i--) {
                if (scol == ecol) {
                    break;
                }
                System.out.print(mat[i][scol] + " ");
            }

            srow++;
            scol++;
            erow--;
            ecol--;
        }
        System.out.println();

    }

    public static void main(String[] args) {

        int matrix[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };

        Spiral_matrix(matrix);
    }
}
