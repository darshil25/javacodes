import java.util.ArrayList;
import java.util.Collections;

public class M24Q2 {

    public static ArrayList lonely(ArrayList<Integer> list){
        ArrayList<Integer> result = new ArrayList<>();
        int n = list.size();

        //bruter force approach
        // for(int i=0; i<n; i++){
        //     boolean iSlonely = true;
        //     for(int j=0; j<n; j++){
        //         if(i != j){
        //             if(Math.abs(list.get(i) - list.get(j)) <= 1){
        //                 iSlonely = false;
        //                 break;
        //             }
        //         }
        //     }
        //     if(iSlonely){
        //         result.add(list.get(i));
        //     }
        // }

        //optimized approach
        Collections.sort(list);
        for(int i=1; i<n-1; i++){
            if(list.get(i-1)+1 < list.get(i) && list.get(i)+1 < list.get(i+1)){
                result.add(list.get(i));
            }
        }

        if(n == 1){
            result.add(list.get(0));
        }

        if(n > 1){
            if(list.get(0)+1 < list.get(1)){
                result.add(list.get(0));
            }
            if(list.get(n-2)+1 < list.get(n-1)){
                result.add(list.get(n-1));
            }
        }
        return result;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(6);
        list.add(5);
        list.add(8);
        System.out.println(lonely(list));
    }
}
