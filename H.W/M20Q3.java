import java.util.*;

public class M20Q3 {

    public static void length(String str, int i){
        if(i == str.length()){
            System.out.println(i);
            return;
        }
        length(str, i+1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        length(str, 0);
    }
}
