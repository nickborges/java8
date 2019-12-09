package ocp.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamMain {

    //finite streams
    public static void finiteStream(){
        Stream<String> s1 = Stream.empty();
        Stream<String> s2 = Stream.of("1");
        Stream<Integer> s3 = Stream.of(1,2,3);
    }

    public static void teste(){
        List<String> l1 = Arrays.asList("a", "b", "c");
        Stream<String> s4 = l1.stream(); //criate a stream from a list
        Stream<String> s5 = l1.parallelStream(); //creates a stream that is allowed to process elements in parallel, you can write code that uses parallelism before even learning what a thread is.
    }

    //infinite streams, but calls a limit() turns it on a finite stream
    public static void infiniteStream(){
        Stream<Double> randoms = Stream.generate(Math::random);
        Stream<Integer> intege = Stream.iterate(1, n -> n + 2);
    }

    //count
    public static void countStream(){
        Stream<String> size = Stream.of("a", "b", "c");
        System.out.println(size.count());
        //closed stream after call size.count()
    }

    //min, max
    public static void minMaxStream(){
        Stream<String> pos = Stream.of("a", "b", "c");
        Optional<String> min = pos.min((a1, a2) -> a1.length() - a2.length());
        min.ifPresent(System.out::println);
        //closed stream after call pos.min()
    }

    //findAny
    public static void findAny(){
        Stream<String> f1 = Stream.of("any1", "any2", "any3");
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


    }
}
