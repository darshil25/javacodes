//Print all prime numbers less than or equal to N

import java.util.*;
public class IBM_10 {
    public static void main(String[] args) {
        int n = 10;
        ArrayList <Integer> list = new ArrayList<>();
        list.add(2);
        for(int i=3; i<=n; i++){
            if(i % 2 != 0){
                list.add(i);
            }
        }
        for(int i=0; i<list.size(); i++){
            System.out.print(list.get(i)+" ");
        }
        
    }
}
