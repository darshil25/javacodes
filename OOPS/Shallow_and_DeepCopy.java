public class Shallow_and_DeepCopy {
    public static void main(String[] args) {
        Constr s1 = new Constr();
        s1.name = "Harsh";
        s1.roll = 7;
        s1.state = "Gujarat";
        s1.marks = new int[3];
        s1.marks[0] = 10;
        s1.marks[1] = 18;
        s1.marks[2] = 16;

        Constr s2 = new Constr(s1); 
        s1.marks[2] = 40;
        System.out.println(s2.name);
        System.out.println(s2.roll);
        System.out.println(s2.state);   
        for (int i = 0; i < 3; i++) {
            System.out.println(s2.marks[i]);
        }
    }
}

class Constr {
    String name;
    int roll;
    String state;
    int[] marks;

    //Shallow Copy Constructor
    // Constr(Constr s1) {
    //     marks = new int[3];
    //     this.name = s1.name;
    //     this.roll = s1.roll;
    //     this.state = s1.state;
    //     this.marks = s1.marks;
    // }

    //Deep Copy Constrctor
    Constr(Constr s1){
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        this.state = s1.state;
        for(int i=0; i<marks.length; i++){
            this.marks[i] = s1.marks[i];
        }
    }
    Constr() {

    }
}
