import java.util.ArrayList;
import java.util.Collections;
public class Sorting {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(5);
        list.add(3);
        list.add(2);
        list.add(4);

        System.out.println("Original list: " + list);

        Collections.sort(list);
        System.out.println("Asscending order list: " + list);

        Collections.sort(list, Collections.reverseOrder());
        System.out.println("Descending order list: " + list);
    }
}
