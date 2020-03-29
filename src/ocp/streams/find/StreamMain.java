package ocp.streams.find;

import java.util.Optional;
import java.util.stream.Stream;

public class StreamMain {

    //findAny
    public static void findAny(){
        Stream<String> f1 = Stream.of("any33", "any2", "any3");
        Optional<String> any = f1.findAny();
        any.ifPresent(System.out::println);
        //closed stream after call f1.findAny()
    }

    //findFirst
    public static void findFirst(){
        Stream<String> f2 = Stream.of("first1","first2","first3");
        Optional<String> first = f2.findFirst();
        first.ifPresent(System.out::println);
        //closed stream after call f2.findFirst()
    }

    public static void main(String args[]){

        findAny();
        findFirst();

    }
}
