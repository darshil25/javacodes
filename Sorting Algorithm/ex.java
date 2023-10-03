import java.util.*;

public class ex {
    public static void main(String[] args) {
        System.out.println("Enter size of array : ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
                
        for(int i=0; i<=size-1; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(arr[4]);
    }
}