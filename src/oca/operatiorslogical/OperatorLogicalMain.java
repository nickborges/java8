package oca.operatiorslogical;

public class OperatorLogicalMain {

    public static void main(String args[]){

        boolean a = true;
        boolean b = false;

        //AND &
        System.out.println("AND &");
        System.out.println(a & b);
        System.out.println(b & a);
        System.out.println(a & a);
        System.out.println(b & b);

        System.out.println("\n");

        //AND &&
        System.out.println("AND &&");
        System.out.println(a && b);
        System.out.println(b && a);
        System.out.println(a && a);
        System.out.println(b && b);

        System.out.println("\n");

        //INCLUSIVE OR |
        System.out.println("INCLUSIVE OR |");
        System.out.println(a | b);
        System.out.println(b | a);
        System.out.println(a | a);
        System.out.println(b | b);

        System.out.println("\n");

        //INCLUSIVE OR ||
        System.out.println("INCLUSIVE OR ||");
        System.out.println(a || b);
        System.out.println(b || a);
        System.out.println(a || a);
        System.out.println(b || b);

        System.out.println("\n");

        //EXCLUSIVER OR - XOR ˆ
        System.out.println("EXCLUSIVER OR - XOR ˆ ");
        System.out.println(a ^ b);
        System.out.println(b ^ a);
        System.out.println(a ^ a);
        System.out.println(b ^ b);


    }
}
