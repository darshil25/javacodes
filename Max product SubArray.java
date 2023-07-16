public class Main {

    public static int[] maxSubArray(int[] nums) {
        int n = nums.length;
        if(n == 0) {
            return new int[0];
        }

        int maxP = nums[0];
        int s = 0, e = 0;
        int currP = nums[0];

        for(int i = 1; i < n; i++) {
            if(currP * nums[i] > nums[i]) {
                currP *= nums[i];
            } else {
                currP = nums[i];
                s = i;
            }

            if(currP > maxP) {
                maxP = currP;
                e = i;
            }
        }

        int[] subarr = new int[end - start + 1];
        for(int i = 0; i <= end - start; i++) {
            subarr[i] = nums[i + start];
        }

        return subarr;
    }

    public static void main(String[] args) {
        int[] nums = {2, 3, -2, 4};

        int[] subarr = maxSubArray(nums);

        System.out.println("Max product subarray: ");
        for(int num : subarray) {
            System.out.print(num + " ");
        }
    }
}
