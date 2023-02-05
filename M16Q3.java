public class M16Q3 {

    public static void Print(int num[][]) {
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[0].length; j++) {
                System.out.print(num[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int arr[][] = {
                { 4, 7, 8 },
                { 8, 8, 7 }
        };
        int row = 2;
        int column = 3;
        Print(arr);
        int transpose[][] = new int[column][row];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                transpose[j][i] = arr[i][j];
            }
        }
        System.out.println("Transpose matrix of above matrix is : ");
        Print(transpose);
    }
}
