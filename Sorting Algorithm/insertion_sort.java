public class insertion_sort {
    public static void Insertion(int arr[]) {
        int n = arr.length;
        // loop for unsorted array
        for (int i = 1; i < n; i++) {
            int curr = arr[i] ;
            int prev = i - 1;
            // finding out correct postion where to insert
            while (prev >= 0 && arr[prev] > curr) {
                arr[prev + 1] = arr[prev];
                prev--;
            }
            // insertion
            arr[prev + 1] = curr;
        }

    }

    // printing array
    public static void Print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
    }

    public static void main(String[] args) {
        int num[] = { 5, 4, 1, 2, 3 };
        Insertion(num);
        Print(num);
    }
}
