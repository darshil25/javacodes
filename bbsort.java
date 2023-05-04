public class bbsort{
    public static void main(String[] args) {
        int arr[] = {5,8,4,9,3,4,7};

        int max = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(max < arr[i]){
                max = arr[i];

            }
        }
    }
}