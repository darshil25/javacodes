import java.util.Arrays;

public class inbuilt_sort {
    public static void Print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int num[] = { 3, 4, 5, 1, 2 };
        Arrays.sort(num);
        Print(num);
    }
}
