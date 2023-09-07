import java.util.Scanner;

public class IBM_1 {
    public static int sum(int a[], int n) {
        int res = 0;
        int s = 0, e = n - 1;
        while (s < e) {
            res += (10 * a[s]) + a[e];
            s++;
            e--;
        }
        if(n%2==0){
            return res;
        }
        else{
            return res+a[n/2];
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println(sum(a, n));
    }
}
