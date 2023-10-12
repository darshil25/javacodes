import java.util.ArrayList;

public class Container_with_most_Water {

    public static int trappedwater(ArrayList<Integer> height) {

        int max = 0;
        // bruteforce O(N^2)
        // for(int i=0; i<height.size(); i++){
        // for(int j=i+1; j<height.size(); j++){
        // int h = Math.min(height.get(i), height.get(j));
        // int w = j-i;
        // max = Math.max(max, h*w);
        // }
        // }

        // 2 pointers approach O(N)
        int left = 0;
        int right = height.size() - 1;

        while (left < right) {
            // get water are
            int h = Math.min(height.get(left), height.get(right));
            int w = right - left;
            int current = h * w;
            max = Math.max(max, current);

            // update pointers
            if (height.get(left) < height.get(right)) {
                left++;
            } else {
                right--;
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
