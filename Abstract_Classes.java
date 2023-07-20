public class Abstract_Classes {
    public static void main(String[] args) {
        Horse h1 = new Horse();
        h1.eat();
        h1.walk();

        Human h2 = new Human();
        h2.walk();
    }
}

abstract class Animal1{
    //Non-abstract method
    void eat(){
        System.out.println("eats panipuri");
    }

    //abstract method
    abstract void walk();
}

//here Horse show error because walk() is compulsory for Horse, means Animal1 have 
//walk() method so Horse have to implement it
class Horse extends Animal1{  
    void walk(){
        //implementation
        System.out.println("walk on 4 legs");
    }
}

class Human extends Animal1{
    void walk(){
        System.out.println("walk on 2 legs");
    }
}
