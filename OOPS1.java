public class OOPS1{
    public static void main(String[] args) {
        //Pen is class
        //Pen() is constructor
        //here p1 will create space in heap for color and tip
        Pen p1 = new Pen();
        p1.setColor("Red");
        p1.setTip(7);
        System.out.println(p1.color + " "+ p1.tip);
    }
}

class Pen{
    String color;
    int tip;

    void setColor(String newColor){
        color = newColor;
    }
    void setTip(int newTip){
        tip = newTip;
    }
}