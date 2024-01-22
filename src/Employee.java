public class Employee extends Person {
    private String position;
    private double salary;

    @Override
    public String toString() {
        return "Employee: " + getId() + ". " + getName() +
                " " + getSurname();
    }

    @Override
    public double getPaymentAmount() {
        return salary;
    }

    public double getSalary() {
        return salary;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Employee() {
    }

    public Employee(String name, String surname, String position, double salary) {
        super(name,surname);
        this.position = position;
        this.salary = salary;
    }
}