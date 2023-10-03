public class M8Q1 {
    public static void main(String args[]) {
        int x = 2, y =5;
        int exp1 = (x * y / x);
        //exp1 ma y/x ni value 2.5 thase pan te x sathe sidhi multiply thai jase convert thaya vagar
        int exp2 = (x * (y / x));
        //exp 2 ma y/x no ans 2.5 avse pan te float value hovathi int ma convert thaine 2 thai jase
        System.out.print(exp1 + ",");
        System.out.print(exp2);
    }
}
