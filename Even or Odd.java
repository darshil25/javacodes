
public class Main
{
    public static int matType(int []arr){
        int n = arr.length;
        int even = 0;
        int odd = 0;
        for(int i=0; i<n; i++){
            if(arr[i] % 2 == 1){
                odd++;
            }
            else{
                even++;
            }
        }
        if(even == 0){
            System.out.print(0);
        }
        else if(odd == 0){
            System.out.print(1);
        }
        else{
            System.out.print("Array with ixed elements");
        }
        return -1;
    }
	public static void main(String[] args) {
		int arr[] = {1,3,5,7,6};
		matType(arr);
	}
}
