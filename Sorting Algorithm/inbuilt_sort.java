import java.util.Arrays;
import java.util.Collections;

public class inbuilt_sort {
    public static void Print(Integer arr[]) {
        for (Integer i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Integer num[] = { 3, 4, 5, 1, 2 };
        Arrays.sort(num,  Collections.reverseOrder());
        Print(num);
    }
}
