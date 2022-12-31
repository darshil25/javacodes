public class maxsubarraysum_KADANE {
    public static void kadane(int number[]) {
        int curSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < number.length; i++) {
            curSum = curSum + number[i];
            if (curSum < 0) {
                curSum = 0;
            }
            maxSum = Math.max(maxSum, curSum);
        }
        System.out.println("Max value of subAraay sum is : " + maxSum);
    }

    public static void main(String[] args) {

        int num[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
        kadane(num);
    }
}
