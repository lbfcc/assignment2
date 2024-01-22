public class Person implements Payable,Comparable {
    private static int counter = 0;
    private int id;
    private String name;
    private String surname;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }

    @Override
    public double getPaymentAmount() {
        return 0;
    }

    public Person() {
        this.id = ++counter;
    }

    public Person(String name, String surname) {
        this.id = ++counter;
        this.name = name;
        this.surname = surname;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
    private String getPosition(String position){
        return "Student";
    }
    @Override
    public int compareTo(Person o) {
        return Double.compare(this.getPaymentAmount(), o.getPaymentAmount());
    }
}