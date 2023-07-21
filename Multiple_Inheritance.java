public class Multiple_Inheritance {
    public static void main(String[] args) {
        Bear b = new Bear();
        b.eatG();
        b.eatM();
    }
}

interface grasseat{
    void eatG();
    
}

interface meateat{
    void eatM();
}

class Bear implements grasseat, meateat{
    public void eatG(){
        System.out.println("Bear is eating Grass");
    }

    public void eatM(){
        System.out.println("Bear is eating Meat");
    }
}