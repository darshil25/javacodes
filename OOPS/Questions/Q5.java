public class Q5 {
    public static void main(String[] args) {
        Vehicle v1 = new Car();
        v1.print();
    }
}

class Vehicle{
    void print(){
        System.out.println("Base Class Vehicle");
    }
}

class Car extends Vehicle{
    void print(){
        System.out.println("Derived class Car");
    }
}
//Output will be taken from print function of Car class
/*
 * Reason - in Car class there are two function of print 1. from Vehicle class and 2. it's own
 *          Because of function overriding but in car class object's its own print() function will be called
 *          That's why it prints "Derived class Car"
 */