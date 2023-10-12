import java.util.ArrayList;

public class Container_with_most_Water {

    public static int trappedwater(ArrayList<Integer> height){

        //bruteforce
        int max = 0;
        for(int i=0; i<height.size(); i++){
            for(int j=i+1; j<height.size(); j++){
                int h = Math.min(height.get(i), height.get(j));
                int w = j-i;
                max = Math.max(max, h*w);
            }
        }
        return max;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(8);
        list.add(6);
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(8);
        list.add(3);
        list.add(7);
        System.out.println(trappedwater(list));
    }
}
