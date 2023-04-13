public class Q5{
    public static void main(String[] args) {
        double x1 = 7;
        double x2 = 8;
        double y1 = 5;
        double y2 = 6;
        double w1 = Math.pow(x2-x1, 2);
        double w2 = Math.pow(y2-y1, 2);
        double distance = Math.sqrt(w1+w2);
        System.out.println("distance is "+distance);
    }
}