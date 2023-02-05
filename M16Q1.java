public class M16Q1 {
    public static int count(int num[][], int key){
        int count = 0;
        //bruteforce method
        for(int i=0; i<num.length; i++){
            for(int j = 0; j<num[0].length; j++){
                if(num[i][j]==key){
                    count++;
                }
            }
        }
        System.out.println(key + " repeated "+ count +" times.");
        return count;
    }

    public static void main(String[] args) {
        int arr[][] = {
                { 4, 7, 8 },
                { 8, 8, 7 }
        };
        int key = 7;
        count(arr, key);
    }
}
