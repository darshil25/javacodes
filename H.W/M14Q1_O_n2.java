public class M14Q1_O_n2 {

    public static boolean BruteF(int arr[]) {

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int array[] = { 1, 2, 4, 1 };
        BruteF(array);
    }
}
