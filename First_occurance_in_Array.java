//you have given an array, You have to return index of value when it occurs first time in array

public class First_occurance_in_Array {

    public static int firstOcc(int arr[], int key, int i){
        if(i==arr.length-1){
            return -1;
        }
        if(arr[i] == key){
            return i;
        }
        return firstOcc(arr, key, i+1);
    }
    public static void main(String[] args) {
        int arr[] = {2,6,7,4,8,9,0,5,6,4,6};
        int key = 10;
        System.out.println(firstOcc(arr,key, 0));
    }
}
