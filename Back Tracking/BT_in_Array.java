/**
 * BT_in_Array
 */
public class BT_in_Array {

    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void btArray(int arr[], int i, int val){
        int n = arr.length;
        //base case
        if(i == n){
            printArr(arr); //print the basic array
            return;
        }

        //work
        arr[i] = val;
        btArray(arr, i+1, val+1);
        arr[i] -= 2;
    }
    public static void main(String[] args) {
        int arr[] = new int[7];
        btArray(arr, 0, 1);
        printArr(arr); //print the final array
    }
}