import java.util.*;

public class updatemark {

    public static void update(int array[]) {
        for (int i = 0; i < array.length; i++) {
            array[i] += array[i] + 1;
        }
    }

    public static void main(String args[]) {
        int marks[] = { 56, 78, 90 };
        update(marks);

        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }
    }
}
