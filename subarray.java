public class subarray {

    public static void SubArray(int number[]) {
        int totalSubArray = 0;
        // start
        for (int i = 0; i < number.length; i++) {
            // end
            for (int j = i; j < number.length; j++) {
                // subarray printing
                for (int k = i; k <= j; k++) {
                    System.out.print(number[k] + " ");
                }
                totalSubArray++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("total subarrays are " + totalSubArray);
    }

    public static void main(String[] args) {

        int num[] = { 2, 4, 6, 8, 10, 12 };
        SubArray(num);
    }
}
