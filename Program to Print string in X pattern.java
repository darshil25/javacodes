import java.util.Scanner;

public class Main {
    public static void pattern(String s) {
        int p = s.length();
        char[][] n = new char[p][p];

    for (int i = 0; i < p; i++) {
        n[i][i] = s.charAt(i);
        n[i][p - i - 1] = s.charAt(p - i - 1);
    }


    for (int i = 0; i < p; i++) {
        for (int j = 0; j < p; j++) {
            if (n[i][j] == 0) {
                n[i][j] = ' ';
            }
            System.out.print(n[i][j] + " ");
        }
        System.out.println();
    }
}

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    pattern(str);
}
}
