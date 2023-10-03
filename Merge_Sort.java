
public class Merge_Sort {

    public static void printarr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void mergeSort(int arr[], int s, int e){

        int mid = (s+e)/2;
        if(s >= e){
            return;
        }
        mergeSort(arr, s, mid);//for left part
        mergeSort(arr, mid+1, e);// for right part
        merge(arr, s, mid, e);
    }

    public static void merge(int arr[], int s, int mid, int e){
        //{2,3,5} = 3 and {6,8,9} = 3 that's why we have to create array of length 6
        int temp[] = new int[e-s + 1];
        int i = s; //starting pointer for left part
        int j = mid+1; //starting pointer for right part
        int k = 0; //starting pointer for temp[]
        while(i<=mid && j<=e){
            if(arr[i] < arr[j]){
                temp[k] = arr[i];
                i++;
            }
            else{
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        //for leftover elements we have to add them at last
        while(i <= mid){
            temp[k++] = arr[i++]; //here arr[i] value stored in temp[k] and both pointers values are increased by 1
            /*temp[k] = arr[i];
                i++;
                k++;
                this code do same as above line*/
        }

        //for leftover elements we have to add them at last
        while(j <= e){
            temp[k++] = arr[j++];
        }

        //copy to main array
        for( k=0, i=s; k<temp.length; i++, k++){
            arr[i] = temp[k];
        }
    }
    public static void main(String[] args) {
        int arr[] = {5, 3, 4, 8, 9, 2};
        mergeSort(arr, 0, arr.length-1);
        printarr(arr);
    }
}