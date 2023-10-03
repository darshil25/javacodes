public class Method_overloading {
    public static void main(String[] args) {
        Calculator clr = new Calculator();
        System.out.println(clr.sum(5,6));
        System.out.println(clr.sum((float) 5.4, (float) 6.3));
        System.out.println(clr.sum(5,6,7));
    }
}

class Calculator{
    int sum(int a, int b){
        return a+b;
    }

    float sum(float a, float b){
        return a+b;
    }

    int sum(int a, int b, int c){
        return a+b+c;
    }
}
