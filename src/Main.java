import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void PrintData(ArrayList<Person> Persons){
        for(Person person: Persons) {
            System.out.println(person.toString() + " earns " + person.getPaymentAmount() + " tenge.");
        }
    }
    public static void main(String[] args) {

        Employee employee1 = new Employee("John", "Lennon", "Manager", 27045.78);
        Employee employee2 = new Employee("George", "Harrison", "Developer", 50000.0);
        Student student1 = new Student("Ringo", "Starr", 2.0);
        Student student2 = new Student("Paul", "McCartney", 3.0);

        ArrayList<Person> Persons = new ArrayList<Person>();
        Persons.add(employee1);
        Persons.add(employee2);
        Persons.add(student1);
        Persons.add(student2);

        PrintData(Persons);

    }

    public static void printData(Iterable<Person> people) {
        for (Person person : people) {
            System.out.printf("%s earns %.2f tenge\n", person.toString(), person.getPaymentAmount());
        }
    }
}