public class M12Q3 {

    public static int revnum(int n) {
        int palnum = n;
        int reverse = 0;
        while (palnum != 0) {
            int LD = palnum % 10;
            reverse = reverse * 10 + LD;
            palnum = palnum / 10;
        }

        if (n == reverse) {
            System.out.println("Number is pal");
        } else {
            System.out.println("Number is not pal");
        }
        return n;
    }

    public static void main(String args[]) {
        revnum(121);

    }
}
