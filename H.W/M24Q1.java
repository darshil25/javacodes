import java.util.ArrayList;

public class M24Q1 {

    public static boolean increase(ArrayList<Integer> list, int n){
        for(int i=0; i<n-1; i++){
            if(list.get(i) > list.get(i+1)){
                return false;
            }
        }
        return true;
    }

    public static boolean decrease(ArrayList<Integer> list, int n){
        for(int i=0; i<n-1; i++){
            if(list.get(i) < list.get(i+1)){
                return false;
            }
        }
        return true;
    }

    public static boolean monotonic(ArrayList<Integer> list){
        boolean i = increase(list, list.size());
        boolean j = decrease(list, list.size());

        if(i == j){
            return false;
        }
        else{
            return true;
        }
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(2);
        list.add(4);
        System.out.print(monotonic(list));
    }
}
