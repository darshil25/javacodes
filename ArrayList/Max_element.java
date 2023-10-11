import java.util.ArrayList;

public class Max_element{
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(20);
        list.add(5);
        list.add(30);
        list.add(25);

        int max = list.get(0);
        for(int i=0; i<list.size(); i++) {
            if(list.get(i) > max) {
                max = list.get(i);
            }
        }
        System.out.println("Max element in the list is: " + max);
    }
}
