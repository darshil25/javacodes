public class Super_Keyword {
    public static void main(String[] args) {
        Horse h1 = new Horse();
        System.out.println(h1.color);
    }
}

class Animal {
    String color;

    Animal() {
        System.out.println("Animal Constructor called");
    }
}

class Horse extends Animal {
    Horse() {
        super.color = "Brown"; // change the value of variable that taken from parent class
        // super();
        // Here We seen that this thing worked as "Abstract classes Constructor
        // working", so what is the use of super() ?
        // in abstract class java automatic put super keyword if we didn't apply.
        System.out.println("Horse Constructor called");
    }
}
