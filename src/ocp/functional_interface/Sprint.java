package ocp.functional_interface;

/**
 * While it is a good practice to mark a functional interface with the @FunctionalInterface
 * annotation for clarity, it is not required with functional programming. The Java compiler
 * implicitly assumes that any interface that contains exactly one abstract method is
 * a functional interface.
 * Conversely, if a class marked with the @FunctionalInterface
 * annotation contains more than one abstract method, or no abstract methods at all, then
 * the compiler will detect this error and not compile.
 */
@FunctionalInterface
public interface Sprint {

    void sprint();

    default String sprint2(){ return "sprint2"; }

    static String sprint3(){ return "sprint3"; }

}
