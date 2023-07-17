public class Hierarchinal_Inheritance_example {
    public static void main(String[] args) {
        Mammals human = new Mammals();
        human.eat();
        human.walk();

        Fish shark = new Fish();
        shark.breathe();

        Bird parraot = new Bird();
        parraot.color = "Green";
        System.out.println(parraot.color);
    }
}

// base class -> Because of Animal class is alredy present in folder if you create another then it give error
// class Animal{
//     //property
//     String color;
//     //function-1
//     void eat(){
//         System.out.println("eat food");
//     }
//     //function-2
//     void breathe(){
//         System.out.println("breathe oxeygen");
//     }
// }

class Mammals extends Animal{
    void walk(){
        System.out.println("They can walk");
    }
}

class Bird extends Animal{
    void Fly(){
        System.out.println("They can Fly");
    }
}

class Fish extends Animal{
    void swim(){
        System.out.println("They can swim");
    }
}