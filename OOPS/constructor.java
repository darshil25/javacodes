public class constructor {
    public static void main(String[] args) {

        Constr s1 = new Constr();      //call 1st type constructor
        Constr s2 = new Constr("Don"); //call 2nd type constructor
        System.out.println(s2.name);
    }
}

class Constr {
    String name;
    int roll;

    //example of non parameterized constructor
    Constr(){
        System.out.println("Hello bhai kitna padhega");
    }

    //example of parameterized constructor
    Constr(String nam){
        this.name = nam;
    }
}
