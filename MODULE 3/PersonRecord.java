import java.util.ArrayList;
import java.util.List;

record Person(String name, int age) {}

public class PersonRecord {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Alice", 25));
        people.add(new Person("Bob", 17));
        people.add(new Person("Charlie", 30));
        List<Person> adults = people.stream()
                                    .filter(p -> p.age() >= 18)
                                    .collect(java.util.stream.Collectors.toList());
        System.out.println("Adults: " + adults);
    }
}