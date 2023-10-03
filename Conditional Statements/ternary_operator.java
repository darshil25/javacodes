public class ternary_operator {
    public static void main(String args[]){
        //Number is odd or even with ternary operator
        int number = 7;

        String num = (number % 2 == 0)? "odd" : "even";
        System.out.println(num);

        //Student pass or fail with ternary operator
        int marks = 45;

        String result = (marks >= 33)? "pass" : "fails";
        System.out.println(result);
    }
}
