package ocp.functional_interface.bipredicate;

import java.util.function.BiPredicate;

public class BiPredicateMain {

    public static void main(String args[]){

        BiPredicate<String, String> b1 = String::startsWith;
        BiPredicate<String, String> b2 = (p, x) -> p.startsWith(x);

        boolean b1b = b1.test("chicken", "chick");
        boolean b2b = b2.test("chicken", "chick");

        System.out.println(b1b);
        System.out.println(b2b);

    }
}
