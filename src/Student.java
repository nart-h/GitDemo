public class Student extends Person{
    private double gpa;

    public Student(String SSN, String name, double gpa) {
        super(SSN, name);
        this.gpa = gpa;

    }

}