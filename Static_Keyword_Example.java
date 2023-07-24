public class Static_Keyword_Example {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.school = "HKV";

        Student s2 = new Student();
        System.out.println(s2.school);

        Student s3 = new Student();
        s3.school = "VIT"; //here we changed school to "VIT", because of static word program won't create seperate
                           //string for same property school. It will change its value to "VIT" from "HKV"
    }
}

class Student{
    String name;
    int rollno;

    //school name should be same for all student, so we should declare it in static word
    static String school;
}
