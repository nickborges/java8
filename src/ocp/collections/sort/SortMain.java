package ocp.collections.sort;

import java.util.*;

public class SortMain {

    public static void main(String[] args) {

        List<Car> lista = Arrays.asList(
                new Car("C"),
                new Car("A")
        );

        lista.sort(Comparator.comparing(Car::getNome));

        System.out.println(lista);

    }

}
