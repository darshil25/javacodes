public class subarray {

    public static void SubArray(int number[]) {
        int totalSubArray = 0;

        // start
        for (int i = 0; i < number.length; i++) {
            int maxsum = Integer.MIN_VALUE;
            // end
            for (int j = i; j < number.length; j++) {
                // subarray printing
                int cursum = 0;

                for (int k = i; k <= j; k++) {
                    System.out.print(number[k] + " ");
                    cursum = cursum + number[k];
                    // comparing cursum and max sum. if cursum greater than it's value will
                    // be stored in maxsum
                    if (cursum > maxsum) {
                        maxsum = cursum;
                    }
                }
                totalSubArray++;
                System.out.println();
                System.out.println("sum of element in array is : " + cursum);
            }
            System.out.println("max sum of array is : " + maxsum);
            System.out.println();

        }
        System.out.println("total subarrays are " + totalSubArray);
    }

    public static void main(String[] args) {

        int num[] = { 2, 4, 6, 8, 10, 12 };
        SubArray(num);
    }
}
