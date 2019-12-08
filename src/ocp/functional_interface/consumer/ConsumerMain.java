package ocp.functional_interface.consumer;

import java.util.function.Consumer;

public class ConsumerMain {

    public static void main(String args[]){
        Consumer<String> c1 = System.out::println;
        Consumer<String> c2 = x -> System.out.println(x);

        c1.accept("C1");
        c2.accept("C2");
    }
}
