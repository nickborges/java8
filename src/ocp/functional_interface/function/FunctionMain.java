package ocp.functional_interface.function;

import java.util.function.Function;

public class FunctionMain {

    public static void main(String args[]){

        Function<String, Integer> f1 = String::length;
        Function<String, Integer> f2 = s -> s.length();

        int f1f = f1.apply("Teste");
        int f2f = f2.apply("Teste");

        System.out.println(f1f);
        System.out.println(f2f);

    }
}
