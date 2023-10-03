public class Constructor {
    public static void main(String[] args) {
        Constr s1 = new Constr("Don");
        System.out.println(s1.name);
    }
}

class Constr {
    String name;
    int roll;

    Constr(String nam){
        this.name = nam;
    }
}
