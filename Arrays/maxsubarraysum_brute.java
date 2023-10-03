public class maxsubarraysum_brute {
    public static void MaxSubArraySum(int number[]) {
        int cursum = 0;
        int maxsum = Integer.MIN_VALUE;

        // start
        for (int i = 0; i < number.length; i++) {
            // end
            for (int j = i; j < number.length; j++) {
                cursum = 0;
                for (int k = i; k <= j; k++) {
                    cursum = cursum + number[k];
                    // comparing cursum and max sum. if cursum greater than it's value will
                    // be stored in maxsum
                    if (cursum > maxsum) {
                        maxsum = cursum;
                    }
                }
                System.out.println("sum of element in array is : " + cursum);
            }

            System.out.println();
        }
        System.out.println("max sum of array is : " + maxsum);
    }

    public static void main(String[] args) {

        int num[] = { 1 };
        MaxSubArraySum(num);
    }
}
