package ocp.streams.count;

import java.util.stream.Stream;

public class StreamMain {

    //count
    public static void countStream(){
        Stream<String> size = Stream.of("a", "b", "c");
        System.out.println(size.count());
        //closed stream after call size.count()
    }

    public static void main(String args[]){

        countStream();

    }
}
