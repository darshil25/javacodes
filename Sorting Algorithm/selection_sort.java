public class selection_sort {
    public static void Selection_sort(int arr[]) {
        int n = arr.length;
        // loop is going to 0 to n-2, here we are taking n-1 bcz of < if it was <=
        // then we can take n-2
        for (int i = 0; i < n - 1; i++) {
            // loop is going to 0 to n-1, here we are taking n bcz of < if it was <=
            // then we can take n-1
            int min_Pos = i;
            // j = i+1 indicates that for i = 0 index vvalue , we take it as minimum so that
            // loop will be run from i+1 index value
            for (int j = i + 1; j < n; j++) {
                if (arr[min_Pos] > arr[j]) {
                    min_Pos = j;
                }
            }
            // swapping
            int temp = arr[min_Pos];
            arr[min_Pos] = arr[i];
            arr[i] = temp;
        }

    }

    // printing array
    public static void Print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
    }

    public static void main(String[] args) {
        int num[] = { 17, 6, 89, 4, 5, 2, 88 };
        Selection_sort(num);
        Print(num);
    }
}
