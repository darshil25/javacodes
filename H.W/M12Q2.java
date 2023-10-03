public class M12Q2 {

    public static boolean isEven(int n) {
        if (n % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String args[]) {
        boolean num = isEven(8);
        System.out.println(num);
    }
}
