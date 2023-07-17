public class Inheritance_example {
    public static void main(String[] args) {
        Fish shark = new Fish();
        shark.eat();
    }
}

//base class
class Animal{
    //property
    String color;
    //function-1
    void eat(){
        System.out.println("eat food");
    }
    //function-2
    void breathe(){
        System.out.println("breathe oxeygen");
    }
}

class Fish extends Animal{
    int swimSpeed;
    int fins;
}
