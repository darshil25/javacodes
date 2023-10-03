public class max_num_in_array {

    public static int Largest(int num[]) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < num.length; i++) {
            if (max < num[i]) {
                max = num[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int numbers[] = { 3, 7, 89, 66, 0, 23, 100, 999 };
        int largestnum = Largest(numbers);
        System.out.println("largest value in array is : " + largestnum);
    }
}
