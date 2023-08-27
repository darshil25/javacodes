import java.util.*;

public class M20Q1 {

    public static void occu(int i, int a[], int key){

        if(i == a.length){
            return;
        }

        if(a[i] == key){
            System.out.print(i + " ");
            occu(i+1, a, key);
        }
        else{
            occu(i+1, a, key);
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        occu(0, arr, k);
    }
}