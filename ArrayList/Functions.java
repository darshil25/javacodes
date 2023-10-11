import java.util.ArrayList;

/**
 * Functions
 */
public class Functions {
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>();

        //add
        list.add(2); //start adding element from 0 index
        list.add(1, 3); //add 3 at index i
        System.out.println(list);

        //get element
        int e = list.get(0);
        System.out.println(e);

        //remove
        list.remove(1);
        System.out.println(list);

        //set element
        list.set(0, 5);
        System.out.println(list);

        //contains
        boolean ans = list.contains(3);
        System.out.println(ans);
    }
}