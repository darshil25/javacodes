public class copyConstructor {
    public static void main(String[] args) {
        Constr s1 = new Constr();
        s1.name = "Harsh";
        s1.roll = 7;
        s1.state = "Gujarat";
        s1.marks = new int[3];
        s1.marks[0] = 10;
        s1.marks[1] = 18;
        s1.marks[2] = 16;

        Constr s2 = new Constr(s1); // we want to copy all properties of s1 to s2
        s1.marks[2] = 40;              //here comes the main problem, we copied all marks from s1 to s2.
                                       //then we made change in s1.marks[2].
                                       //but we already copied detais o in s2 marks[2] should be 16.but it gives 40
                                       //to solve this problem we use deep copy
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

    // Copy Constructor
    Constr(Constr s1) {
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        this.state = s1.state;
        this.marks = s1.marks;
    }

    Constr() {

    }
}
