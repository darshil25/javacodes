import java.util.*;

public class MultiDimentional {
    public static void main(String[] args) {
        //main list
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();

        //sub lists
        ArrayList<Integer> List1 = new ArrayList<>();
        ArrayList<Integer> List2 = new ArrayList<>();
        ArrayList<Integer> List3 = new ArrayList<>();

        for(int i=1; i<=5; i++){
            List1.add(i);
            List2.add(i*2);
            List3.add(i*3);
        }

        //adding sub lists to main list
        mainList.add(List1);
        mainList.add(List2);
        mainList.add(List3);

        //printing main list
        System.out.println(mainList);

        //nested loops
        for(int i=0; i<mainList.size(); i++){
            ArrayList<Integer> CurrList = mainList.get(i);
            for(int j=0; j<CurrList.size(); j++){
                System.out.print(CurrList.get(j)+" ");
            }
            System.out.println();
        }
    }
}
