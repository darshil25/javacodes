public class character_pattern {
    public static void main(String args[]) {

        char ch = 'A';

        for (int line = 1; line <= 4; line++) {
            for (int chara = 1; chara <= line; chara++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}
