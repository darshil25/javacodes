public class search_in_array {

    public static boolean Search(int num[][], int key) {
        // BRUTE FORCE METHOD | TIME COMLEXITY = O(n^2)
        // for (int i = 0; i < num.length; i++) {
        // for (int j = 0; j < num[0].length; j++) {
        // if (num[i][j] == key) {
        // System.out.print(key + " found at position " + i + "," + j);
        // }
        // }
        // }
        int row = 0, col = num[0].length - 1;
        // taking top-right(40) as starting point
        while (row < num.length && col >= 0) {
            if (num[row][col] == key) {
                System.out.println("key found at " + row + ", " + col);
                return true;
            } else if (key < num[row][col]) {
                col--;
            } else {
                row++;
            }
        }
        System.out.println("key not found");
        return false;
    }

    public static void main(String[] args) {
        int arr[][] = { { 10, 20, 30, 40 },
                { 15, 25, 35, 45 },
                { 27, 29, 37, 48 },
                { 32, 33, 39, 50 } };
        int key = 33;
        Search(arr, key);
    }
}
