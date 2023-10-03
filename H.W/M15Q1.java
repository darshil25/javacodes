/**
 * M15Q1
 */
public class M15Q1 {
    public static void bubblesort(int n[]) {
        int ld = n.length;
        for (int i = 0; i < ld - 1; i++) {
            for (int j = 0; j < ld - 1 - i; j++) {
                if (n[j] > n[j + 1]) {
                    int temp = n[j + 1];
                    n[j + 1] = n[j];
                    n[j] = temp;
                }
            }
        }
    }

    public static void selectionsort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int small = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[small] > arr[j]) {
                    small = j;
                }
            }
            int temp = arr[small];
            arr[small] = arr[i];
            arr[i] = temp;
        }
    }

    public static void insertionsort(int arr[]) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int cur = arr[i];
            int prev = i - 1;
            while (prev >= 0 && arr[prev] > cur) {
                arr[prev + 1] = arr[prev];
                prev--;
            }
            arr[prev + 1] = cur;
        }
    }

    public static void countingsort(int arr[]) {
        int n = arr.length;

        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }

        int count[] = new int[n + 1];
        for (int i = 0; i < n; i++) {
            count[arr[i]]++;
        }

        int j = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }

    public static void print(int n[]) {
        for (int i = 0; i < n.length; i++) {
            System.out.print(n[i] + ", ");
        }
    }

    public static void main(String[] args) {
        int num[] = { 3, 6, 2, 1, 8, 7, 4, 5, 3, 1 };
        countingsort(num);
        print(num);
    }
}