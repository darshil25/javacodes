import java.util.LinkedList;

public class Inbuilt_mehods {
    public static void main(String[] args) {
        //creation of list
        LinkedList<Integer> list = new LinkedList<>();

        //add operaions
        list.addFirst(0);
        list.addLast(1);
        list.addLast(2);
        list.addFirst(3);
        //3->0->1->2

        //print list
        System.out.println(list);

        //remove operations
        list.removeFirst(); //0->1->2
        System.out.println(list);
        list.removeLast(); //0->1
        System.out.println(list);
    }
}
