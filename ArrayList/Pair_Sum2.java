import java.util.ArrayList;

public class Pair_Sum2 {

    public static boolean sum(ArrayList<Integer> list, int target){
        int n = list.size();
        int bpoint = -1;

        for(int i=0; i<n; i++){
            if(list.get(i) > list.get(i+1)){
                bpoint = i;
                break;
            }
        }

        int lp = bpoint+1; //pointing smallest ele
        int rp = bpoint; // pointing largest ele

        while(lp != rp){
            //case 1
            if(list.get(lp) + list.get(rp) == target) {
                return true;
            }
            //case 2
            if(list.get(lp) + list.get(rp) < target) {
                lp = (lp+1)%n;
            }
            else {
                rp = (n+rp-1)%n;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        int t = 16;
        System.out.print(sum(list, t));
    }
}
