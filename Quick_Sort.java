public class Quick_Sort {

    public static void printarr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void quickSort(int arr[], int s, int e){

        if(s>=e){
            return;
        }
        int pivotIndex = pindex(arr, s, e); //taking pivot as last element
        quickSort(arr, s, pivotIndex-1);  //here we don't have to change value of pivot element that's why pi-1 and pi+1
        quickSort(arr, pivotIndex+1, e);
    }

    public static int pindex(int arr[], int s, int e){
        int pivot = arr[e];
        int i=s-1;
        for(int j=s; j<e; j++){
            if(arr[j] <= pivot){
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        int temp = pivot;
        arr[e] = arr[i];
        arr[i] = temp;
        return i;
    }

    public static void main(String[] args) {
        int arr[] = {5, 3, 4, 8, 9, 2};
        quickSort(arr, 0, arr.length-1);
        printarr(arr);
    }
}
