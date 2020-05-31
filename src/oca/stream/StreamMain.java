package oca.stream;

import java.util.Arrays;
import java.util.List;

public class StreamMain {

    static List<Person> persons = Arrays.asList(
            new Person("Fulano 3", 20),
            new Person("Fulano 1", 23),
            new Person("Fulano 2",31)
    );

    public static void filter(){
        persons.stream()
                .filter(n -> n.getName().contains("2"))
                .map(Person::getName)
                .forEach(System.out::println);
    }

    public static void mapToInt(){
        persons.stream()
                .mapToInt(Person::getAge)
                .sum();
    }

    public static void main(String[] args) {
        filter();
        mapToInt();


    }
}
