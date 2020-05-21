package ocp.optional;

import java.util.Optional;

public class OptionalMain {

    public static void main(String args[]) throws Throwable {

        //orElse
        Optional<String> o1 = Optional.ofNullable(null);
        String a = o1.orElse("CCC");
        System.out.println(a); //CCC

        //orElseGet
        Optional<Double> o2 = Optional.ofNullable(null);
        Double b = o2.orElseGet(() -> Math.random());
        System.out.println(b); // random number

        //orElseThrow
        Optional<String> o3 = Optional.ofNullable("ABC");
        String c = o3.orElseThrow(() -> new RuntimeException("valor não informado."));
        System.out.println(c);

        Optional<String> o4 = Optional.ofNullable(null);
        String d = o4.orElseThrow(() -> new RuntimeException("valor não informado"));
        System.out.println(d);
        //orElseThrow

    }
}
