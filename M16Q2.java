public class M16Q2 {

    public static int sumof2nd(int num[][]) {
        int sum = 0;
        int i = 1;
        for (int j = 0; j < num.length; j++) {
            sum = sum + num[i][j];
        }
        System.out.println("sum of 2nd row in array is " + sum);
        return sum;
    }
    public static void main(String[] args) {
        int arr[][] = {
                { 4, 7, 8 },
                { 8, 8, 7 },
                {9, 10, 5}
        };
        sumof2nd(arr);
    }
}
