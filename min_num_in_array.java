public class min_num_in_array {
    public static int Smallest(int num[]) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < num.length; i++) {
            if (min > num[i]) {
                min = num[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int numbers[] = { 3, 7, -89, 66, 0, 23, 100, 999 };
        int smallestnum = Smallest(numbers);
        System.out.println("Smallest value in array is : " + smallestnum);
    }
}
