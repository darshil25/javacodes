import java.util.*;
public class M7Q3 {
    public static void main(String args[]) {
        System.out.println("Enter value of pencil :- ");
        Scanner sc = new Scanner(System.in);

        Float pencil = sc.nextFloat();

        System.out.println("Enter value of pen :- ");
        Float pen = sc.nextFloat();

        System.out.println("Enter value of eraser :- ");
        Float eraser = sc.nextFloat();

        Float sum = pencil+pen+eraser;
        System.out.println("Your Total Purchase Value is :- "+sum);

        sum = sum + sum*0.18f;
        System.out.println("Your Total Purchase Value with 18% GST is :- "+sum);
    }
}
