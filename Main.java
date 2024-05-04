import company.beans.Person;
import company.exceptions.InvalidAgeException;

public class Main {
    public static void main(String[] args) {
        try {
            Person person = new Person("Anton", 27);
            System.out.println("Name: " + person.getName() + ", Age: " + person.getAge());
        } catch (InvalidAgeException e) {
            System.err.println("Failed to create person: " + e.getMessage());
        }
    }
}
