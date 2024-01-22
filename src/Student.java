public class Student extends Person{

    private double gpa;

    @Override
    public String toString() {
        return "Student: " + getId() + ". " + getName() +
                " " + getSurname();
    }

    @Override
    public double getPaymentAmount() {
        if (gpa > 2.67) {
            return 36600;
        }
        else{
            return 0;
        }
    }

    public Student(String name, String surname, double gpa) {
        super(name, surname);
        this.gpa = gpa;
    }

    public Student() {}

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public double getGpa() {
        return gpa;
    }
}