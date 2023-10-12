import java.util.ArrayList;

public class Pair_Sum {

    public static boolean pairSum(ArrayList<Integer> list, int target){

        //brute force - O(N^2)
        // for(int i=0; i<list.size(); i++){
        //     for(int j=i+1; j<list.size(); j++){
        //         if(list.get(i)+list.get(j) == target){
        //             return true;
        //         }
        //     }
        // }

        //2 pointer approach
        int l = 0;
        int r = list.size() - 1;

        while(l < r){
            if(list.get(r) + list.get(l) == target){
                return true;
            }
            if(list.get(r) + list.get(l) > target){
                r--;
            }
            if(list.get(r) + list.get(l) < target){
                l++;
            }
        }

        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        int target = 5;
        System.out.print(pairSum(list, target));
    }
}
