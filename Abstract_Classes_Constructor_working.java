public class Abstract_Classes_Constructor_working {
    public static void main(String[] args) {
        Cars c1 = new Cars();
      //Vehicle --> FourWheel --> Cars
    }
}

abstract class Vehicle{
    Vehicle(){
        System.out.println("Vehicle Constructor called");
    }
}

class FourWheel extends Vehicle{
    FourWheel(){
        System.out.println("FourWheel Constructor called");
    }
}

class Cars extends FourWheel{
    Cars(){
        System.out.println("Cars Constructor called");
    }
}