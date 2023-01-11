public class buble_sort {

    public static void Sorting(int arr[]) {
        int n = arr.length;
        // loop is going to 0 to n-2, here we are not taking n-2 bcz of < if it was <=
        // then we can take n-2
        for (int turn = 0; turn < n - 1; turn++) {
            // loop is going to 0 to n-2-turn, here we are not taking n-2-turn bcz of < if
            // it was <= then we can take n-2-turn
            for (int j = 0; j < n - 1 - turn; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swapping
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    // printing array
    public static void Print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
    }

    public static void main(String[] args) {
        int num[] = { 3, 6, 9, 7, 4, 2, 1 };
        Sorting(num);
        Print(num);
    }
}