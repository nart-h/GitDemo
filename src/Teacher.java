public class Teacher extends Person {
    private double salary;

    public Teacher(String SSN, String name, double salary) {
        super(SSN, name);
        this.salary = salary;
    }
}
