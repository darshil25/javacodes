public class maxsubarraysum_prefix {
    public static void MaxSubArraySum(int number[]) {
        int cursum = 0;
        int maxsum = Integer.MIN_VALUE;
        int prefix[] = new int[number.length];

        prefix[0] = number[0];
        for (int i = 1; i < number.length; i++) {
            prefix[i] = prefix[i - 1] + number[i];
        }

        // start
        for (int i = 0; i < number.length; i++) {
            int start = i;
            // end
            for (int j = i; j < number.length; j++) {
                int end = j;
                cursum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];
                // comparing cursum and max sum. if cursum greater than it's value will
                // be stored in maxsum
                if (cursum > maxsum) {
                    maxsum = cursum;
                }
            }
            // System.out.println("sum of element in array is : " + cursum);
        }
        System.out.println("max sum of array is : " + maxsum);
        System.out.println();
    }

    public static void main(String[] args) {

        int num[] = { 2, 4, 6, 8, 10 };
        MaxSubArraySum(num);
    }
}
