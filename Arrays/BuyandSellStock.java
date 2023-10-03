public class BuyandSellStock {
    public static int StockB_S(int data[]) {

        int Buy = Integer.MAX_VALUE;
        int MaxProfit = 0;

        for (int i = 0; i < data.length; i++) {
            if (Buy < data[i]) {
                int Profit = data[i] - Buy;
                MaxProfit = Math.max(Profit, MaxProfit);
            } else {
                Buy = data[i];
            }
        }
        return MaxProfit;
    }

    public static void main(String[] args) {

        int Price[] = { 7, 1, 5, 3, 6, 4 };
        System.out.println(StockB_S(Price));
    }
}
