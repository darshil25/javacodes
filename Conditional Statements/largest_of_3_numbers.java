public class largest_of_3_numbers {
    public static void main(String args[]){
        int a = 5;
        int b = 7;
        int c = 8;

        if(a>b && a>c){
            System.out.println("A is Greatest");
        }
        else if(b>a && b>c){
            System.out.println("B is Greatest");
        }
        else{
            System.out.println("C is Greatest");
        }
    }
}
