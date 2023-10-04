/**
 * M21Q1
 */
public class M21Q1 {

    public static void printarr(String arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void mergeSort(String arr[], int s, int e){
        if(s >= e){
            return;
        }
        int mid = (s+e)/2;
        mergeSort(arr, s, mid);
        mergeSort(arr, mid+1, e);
        merge(arr, s, mid, e);
    }

    public static void merge(String arr[], int s, int mid, int e){
        int i = s;
        int j = mid+1;
        int k=0;
        String temp[] = new String[e-s + 1];
        
        while(i <= mid && j<=e){
            int res = arr[i].compareTo(arr[j]);
            if(res < 0){
                temp[k] = arr[i];
                i++;
            }
            else{
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        while(i <= mid){
            temp[k++] = arr[i++];
        }
        while(j <= e){
            temp[k++] = arr[j++];
        }
        
        for(k=0, i=s; k<temp.length; i++, k++){
            arr[i] = temp[k];
        }
    }

    public static void main(String[] args) {
        String arr[] = {"sun", "earth", "mars", "mercury"};
        mergeSort(arr, 0, arr.length-1);
        printarr(arr);
    }
}