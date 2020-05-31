package more;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortForEachMain {

    public static void main(String[] args) {
        List<Person> persons = Arrays.asList(
                new Person("Person 4"),
                new Person("Person 2"),
                new Person("Person 1"),
                new Person("Person 3")
        );

        persons.sort(Comparator.comparing(Person::getName));

        persons.forEach(System.out::println);

    }
}
