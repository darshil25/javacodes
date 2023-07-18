public class NeonNumbers {
    public static void main(String[] args) {
        for (int i = 1; i <= 1000; i++) {
            int square = i * i;
            int sum = 0;
            int num = square;

            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }

            if (sum == i) {
                System.out.println(i);
            }
        }
    }
}
