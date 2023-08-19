import java.util.*;
public class Accenture_Coding {

    public static int action(int a[], int n){
        int max = 0;
        for(int i=0; i<n; i++){
            int cXOR = 0;
            int cSUM = 0;
            for(int j=i; j<n; j++){
                cXOR = cXOR ^ a[j];
                cSUM = cSUM + a[j];

                if(cXOR==cSUM){
                    int cLen = j - i + 1;
                    max = Math.max(max, cLen);
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int arr[] = new int[k];
        for(int i=0; i<k; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(action(arr, k));
    }
}
