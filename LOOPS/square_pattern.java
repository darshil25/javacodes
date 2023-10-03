public class square_pattern {
    public static void main(String args[]) {
        
        System.out.println("Square with for loop");
        for(int i = 1; i<=4; i++){
            System.out.println("* * * *");
        }

        System.out.println("---------------------------------");

        System.out.println("Square with while loop");
        int line = 1;
        while(line <= 4){
            System.out.println("* * * *");
            line++;
        }
    }
}
