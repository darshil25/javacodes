import java.util.*;

public class M9Q3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter number of day : ");
        int day = sc.nextInt();

        switch (day) {
            case 1: System.out.println("Today is monday"); break;
            case 2: System.out.println("Today is Tuesday"); break;
            case 3: System.out.println("Today is Wednesday"); break;
            case 4: System.out.println("Today is Thursday"); break;
            case 5: System.out.println("Today is Friday"); break;
            case 6: System.out.println("Today is Saturday"); break;
            case 7: System.out.println("Today is Sunday"); break;
            default: System.out.println("enter valid number of day"); break;
        }
    }
}
