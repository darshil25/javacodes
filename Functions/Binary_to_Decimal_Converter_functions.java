public class Binary_to_Decimal_Converter_functions {

    public static void BinToDec(int BinNum) {
        int myNum = BinNum;
        int pow = 0;
        int DecNum = 0;

        while (BinNum > 0) {
            int LastD = BinNum % 10;
            DecNum = DecNum + (LastD * (int) Math.pow(2, pow));

            pow++;
            BinNum = BinNum / 10;
        }
        System.out.println("Decimal of " + myNum + " is " + DecNum);
    }

    public static void main(String args[]) {
        BinToDec(10111011);
    }

}
