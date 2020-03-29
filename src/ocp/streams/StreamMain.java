package ocp.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamMain {

    //stream from list
    public static void streamFromList(){
        List<String> l1 = Arrays.asList("a", "b", "c");
        Stream<String> s4 = l1.stream(); //create a stream from a list
        Stream<String> s5 = l1.parallelStream(); //creates a stream that is allowed to process elements in parallel, you can write code that uses parallelism before even learning what a thread is.
    }

    //finite streams
    public static void finiteStream(){
        Stream<String> s1 = Stream.empty();
        Stream<String> s2 = Stream.of("1");
        Stream<Integer> s3 = Stream.of(1,2,3);
    }

    //infinite streams, but calls a limit() turns it on a finite stream
    public static void infiniteStream(){
        Stream<Double> randoms = Stream.generate(Math::random);
        Stream<Integer> intege = Stream.iterate(1, n -> n + 2);
    }

    public static void main(String args[]){

        streamFromList();
        finiteStream();
        infiniteStream();

    }
}
