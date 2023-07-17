public class Multilevel_Inheritance_example {
    public static void main(String[] args) {
        Dogs sheru = new Dogs();
        sheru.eat();
        sheru.legs = 4;
        System.out.println(sheru.legs);
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
    int legs;
}

class Dogs extends Mammals{
    String Breed;
}

