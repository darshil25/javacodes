public class binary_search {

    public static int BinarySearch(int num[], int key) {

        int start = 0;
        int end = num.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;

            // compare parts
            if (num[mid] == key) {
                return mid;
            }
            if (num[mid] > key) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int numbers[] = { 3, 4, 5, 6, 7, 8, 9, 10, 11 };
        int key = 4;
        int number = BinarySearch(numbers, key);
        System.out.println("Index value of given key is : " + number);
    }
}