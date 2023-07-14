public class Main {
    public static void solve(int[] A, int size) {
        for(int i=0; i<size; i++){
            int j;
            for(j=i+1; j<size; j++){
                if(A[i] < A[j]){
                    break;
                }
            }
            if(j==size){
                    System.out.print(A[i] + " ");
                }
        }
    }
    
    public static void main(String[] args) {
        int arr[] = {16,17,4,3,5,2};
        int n = arr.length;
        solve(arr, n);
    }
}
