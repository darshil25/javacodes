//you have given an array, You have to return index of value when it occurs last time in array

public class Last_occurance_in_Array {

    public static int lastOcc(int a[], int key, int i){
        if(i==0){
            return -1;
        }
        if(a[i] == key){
            return i;
        }
        return lastOcc(a, key, i-1);
    }

    public static void main(String[] args) {
        int arr[] = {2,6,7,0,4,8,9,0,5,6,4,6};
        int key = 0;
        System.out.println(lastOcc(arr,key, arr.length-1));
    }
}
