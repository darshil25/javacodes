import java.util.*;
public class pre_post_increament_decreament {
    public static void main(String args[]){
        //PreIncreament
        int a = 23;
        int b = ++a;
        System.out.println(a);
        System.out.println(b);

        //PostIncreament
        int c = 3;
        int d = c++;
        System.out.println(c);
        System.out.println(d);
        
        //PreDecrement
        int e = 23;
        int f = --e;
        System.out.println(e);
        System.out.println(f);

        //PostDecrement
        int g = 3;
        int h = g--;
        System.out.println(g);
        System.out.println(h);
    }
}
