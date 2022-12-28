public class pairs_in_array {

    public static void Pair(int numbers[]) {

        for (int i = 0; i < numbers.length; i++) {
            int start = numbers[i];
            for (int j = i + 1; j < numbers.length; j++) {
                System.out.print("(" + start + ", " + numbers[j] + ") ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int num[] = { 2, 4, 6, 8, 10, 12, 14 };
        Pair(num);
    }
}
