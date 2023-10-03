public class odd_even {

    public static void oddoreven(int n) {
        int BitMask = 1;
        if ((BitMask & n) == 0) {
            // 0000001 & n's binary form's LSB(left significant Bit) performing operation
            System.out.println("even number");
        } else {
            System.out.println("odd number");
        }
    }

    public static void main(String[] args) {
        oddoreven(56);
        oddoreven(23);
    }
}
