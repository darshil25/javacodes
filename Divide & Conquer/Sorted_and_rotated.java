/**
 * Sorted_and_rotated
 */
public class Sorted_and_rotated {

    public static int rotated(int arr[], int tar, int s, int e){
        int mid = (s+e)/2;

        //case 1: found on mid
        if(arr[mid] == tar){
            return mid;
        }

        //case 2: On line 1
        if(arr[s] <= arr[mid]){
            //case a: on left side
            if(arr[s] <= tar && tar <= arr[mid]){
                return rotated(arr, tar, s, mid-1);
            }
            //case b: on right side of target (L1's right + L2)
            else{
                return rotated(arr, tar, mid+1, e);
            }
        }
        //Case 3: On L2
        else{
            //case a: on right side
            if(arr[mid] <= tar && tar <= arr[e]){
                return rotated(arr, tar, mid+1, e);
            }
            //case b: on left side of target (L2's left + L1)
            else{
                return rotated(arr, tar, s, mid-1);
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {4,5,6,7,0,1,2};
        int target = 1;
        System.out.println(rotated(arr, target, 0, arr.length-1));
    }
}