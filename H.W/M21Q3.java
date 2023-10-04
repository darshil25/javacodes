public class M21Q3 {
    //Brute Force (O(n^2))
    public static int quickSort(int arr[]){
        int count = 0;
        for(int i=0; i<arr.length-1; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] > arr[j]){
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int arr[] = {2, 4, 1, 3, 5};
        System.out.println(quickSort(arr));
    }
}
