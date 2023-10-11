import java.util.ArrayList;

public class reverse_AL {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1); list.add(2); list.add(3); list.add(4); list.add(5);

        System.out.println("Original list: " + list);   

        //reverse the list
        System.out.print("reversed list :- ");
        for(int i=list.size()-1; i>=0; i--) {
            System.out.print(list.get(i)+" ");
        }
    }
}