public class linear_search {

    public static int LinearSearch(int me[], int key) {

        for (int i = 0; i < me.length; i++) {
            if (me[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int items[] = { 1, 2, 6, 8, 90, 67, 9 };
        int key = 8;
        int index = LinearSearch(items, key);
        if (index == -1) {
            System.out.println("Not found");
        } else {
            System.out.println("found at index position : " + index);
        }
    }
}
