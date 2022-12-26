public class linear_search {

    public static int LinearSearch(int num[], int key) {

        for (int i = 0; i < num.length; i++) {
            if (num[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int number[] = { 1, 2, 3, 5, 8, 59, 88, 90, 6 };
        int key = 90;
        int index = LinearSearch(number, key);
        if (index == -1) {
            System.out.println("Not found");
        } else {
            System.out.println("found at index position : " + index);
        }
    }
}
