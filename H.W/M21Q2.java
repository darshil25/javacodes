public class M21Q2 {

    public static int majority(int arr[]){
        int com = arr.length/2;
        int count;
        for(int i=0; i<arr.length-1; i++){
            count = 0;
            for(int j=0; j<arr.length; j++){
                if(arr[i] == arr[j]){
                    count++;
                }
            }
            if(count > com){
                return arr[i];
            }
        }
        return -1;
    } 
    public static void main(String[] args) {
        int arr[] = {3,2,3};
        System.out.println(majority(arr));
    }
}
