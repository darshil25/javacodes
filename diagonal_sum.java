
public class diagonal_sum {

    public static int diagonal(int arr[][]) {
        int sum = 0;
        /*
         * Time complexity = O(N^2)
         * for (int i = 0; i < arr.length; i++) {
         * for (int j = 0; j < arr[0].length; j++) {
         * // Primary Diagonal
         * if (i == j) {
         * sum = sum + arr[i][j];
         * }
         * //Secondary Diagonal
         * else if (i + j == arr.length - 1) {
         * sum = sum + arr[i][j];
         * }
         * }
         * }
         */

        //Time Complexity O(N) Method
        for(int i=0; i<arr.length; i++){
            //First Diagonal
            sum = sum + arr[i][i]; //or [j][j] bcz in first layer we take sum of (1,1), (2,2).....
            //Second Diagonal
            //this layer is sum of (0,3), (1,2), (2,1), (3,0) so sum of i+j=3; i+j=arr.length-1, 
            //here array length is 4 || so j = arr.length-1-i
            if(i != arr.length-1-i){
                sum = sum + arr[i][arr.length-1-i];
            }
        }System.out.println(sum);
        return sum;

    }

    public static void main(String[] args) {
        int matrix[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };

        diagonal(matrix);
    }
}
