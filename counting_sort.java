public class counting_sort {
    public static void counting(int arr[]) {
        int Largest = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            Largest = Math.max(Largest, arr[i]);
        }

        //frequency count
        int count[] = new int[arr.length+1]; //we set size +1 bcz in counting array we have to include 0 which is not in current array
        for(int i=0; i<arr.length; i++){
            count[arr[i]]++;
        }

        //sorting
        int j = 0;
        for(int i=0; i<count.length; i++){
            while(count[i] > 0){
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }

    // printing array
    public static void Print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
    }

    public static void main(String[] args) {
        int num[] = { 1, 4, 1, 3, 2, 4, 3, 7 };
        counting(num);
        Print(num);
    }
}
