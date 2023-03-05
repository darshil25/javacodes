public class Binary_Operations {

    public static int GetithBit(int n, int i) {
        int BitMask = 1 << i;
        if ((n & BitMask) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public static int SetithBit(int n, int i) {
        int BitMask = 1 << i;
        return n | BitMask;
    }

    public static int ClearithBit(int n, int i) {
        int BitMask = ~(1 << i);
        return n & BitMask;
    }

    public static int UpdateithBit(int n, int i, int newBit) {
        /*
         * 1st method
         * if (newBit == 0) {
         * return (SetithBit(n, i));
         * } else {
         * return (ClearithBit(n, i));
         * }
         */

        // 2nd method
        n = ClearithBit(n, i);
        int BitMask = newBit << i;
        return (n | BitMask);
    }

    public static void main(String[] args) {
        System.out.println(GetithBit(15, 2));
        System.out.println(SetithBit(10, 2));
        System.out.println(ClearithBit(10, 1));
        System.out.println(UpdateithBit(10, 2, 1));
    }
}
