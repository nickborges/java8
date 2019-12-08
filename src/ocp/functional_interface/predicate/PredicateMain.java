package ocp.functional_interface.predicate;

import java.util.function.Predicate;

public class PredicateMain {

    public static void main(String args[]){

        Predicate<String> p1 = String::isEmpty;
        Predicate<String> p2 = x -> x.isEmpty();

        boolean p1p = p1.test("");
        boolean p2p = p2.test("");

        System.out.println(p1p);
        System.out.println(p2p);



    }
}
