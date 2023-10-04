public class M21Q2 {
    //Linear search O(n^2)
    // public static int majority(int arr[]){
    //     int com = arr.length/2;
    //     int count;
    //     for(int i=0; i<arr.length-1; i++){
    //         count = 0;
    //         for(int j=0; j<arr.length; j++){
    //             if(arr[i] == arr[j]){
    //                 count++;
    //             }
    //         }
    //         if(count > com){
    //             return arr[i];
    //         }
    //     }
    //     return -1;
    // } 

    //Optimized way
    public static int majority(int arr[]){
        return majCount(arr, 0, arr.length-1);
    }

    public static int majCount(int arr[], int s, int e){
        if(s==e){
            return arr[s];
        }

        int mid = (s+e)/2;

        int leftPart = majCount(arr, s, mid);
        int rightPart = majCount(arr, mid+1, e);

        if(leftPart == rightPart){
            return leftPart;
        }

        int leftC = Count(arr, leftPart, s, e);
        int rightC = Count(arr, rightPart, s, e);

        if(leftC > rightC){
            return leftPart;
        }
        else{
            return rightPart;
        }
    }

    public static int Count(int arr[], int num, int s, int e){
        int count = 0;
        for(int i=s; i<=e; i++){
            if(arr[i] == num){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[] = {3,2,3};
        System.out.println(majority(arr));
    }
}
