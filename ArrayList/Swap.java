import java.util.ArrayList;

public class Swap {

    public static void swap(ArrayList<Integer> list, int i, int j) {
        int temp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, temp);
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(20);
        list.add(5);
        list.add(30);
        list.add(25);

        int id1 = 2;
        int id2 = 4;

        System.out.println("Before swapping: " + list);
        swap(list, id1, id2);
        System.out.println("After swapping: " + list);
    }
}
