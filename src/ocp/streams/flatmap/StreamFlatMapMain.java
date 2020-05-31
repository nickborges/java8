package ocp.streams.flatmap;

import ocp.streams.dto.Person;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.DoubleStream;

/**
 * flatMap = executa métodos em sequência
 */
public class StreamFlatMapMain {

    static List<Person> persons = Arrays.asList(
            new Person("Fulano 3", 1),
            new Person("Fulano 1", 2),
            new Person("Fulano 4", 2),
            new Person("Fulano 2", 3)
    );

    static Optional<Double> inverse(Double x) {
        return x == 0 ? Optional.empty() : Optional.of(12 / x);
    }

    static Optional<Double> squareRoot(Double x) {
        return x < 0 ? Optional.empty() : Optional.of(Math.sqrt(x));
    }

    static void flatMap() {
        Optional<Double> result =
                Optional.of(3.0)
                        .flatMap(StreamFlatMapMain::inverse)
                        .flatMap(StreamFlatMapMain::squareRoot);

        if (result.isPresent()) {
            System.out.println("flatMap = " + result.get());
        }
    }

    static void flatMap(List<Person> persons) {
        persons.stream()
                .flatMapToDouble(
                        d -> DoubleStream.builder()
                                .add(inverse(
                                        persons.stream()
                                                .map(Person::getAge)
                                                .max(Integer::compareTo)
                                                .get().doubleValue()
                                        ).get()
                                ).build())
				.flatMap(
					d -> DoubleStream.builder()
							.add(squareRoot(d).get())
							.build())
				.findFirst()
                .ifPresent(System.out::println);
    }

    static void average(){
    	persons.stream()
				.mapToDouble(Person::getAge)
				.average()
				.ifPresent(System.out::println);
	}

    public static void main(String args[]) {
        flatMap();
        flatMap(persons);
        average();

    }

}
