package oca.predicable;


import java.util.function.Predicate;

public class Predicable2Main {

    public static String caller(String d) {
        return d;
    }

    public static void main(String args[]){

        try {
            int meal = 5;
            int tip = 2;
            int total = meal + (meal>6 ? ++tip : --tip);
            System.out.println(total);

            Predicate<String> p1 = c -> 1 > 0;
            System.out.println(p1.test("–"));

            Predicate<String> p2 = c -> c.startsWith("a");
            System.out.println(p2.test("a"));

            Predicate<String> p22 = c -> c.startsWith("-");
            System.out.println(p22.test("-"));

            /*Predicate p3 = c -> c.startsWith("-");
            System.out.println(p3.test("–"));*/

            Predicate p4 = c1 -> c1.equals("-");
            System.out.println(p4.test("-"));

            Predicate<String> p42 = c1 -> c1.equals("-");
            System.out.println(p42.test("-"));

            Predicate p5 = c1 -> { System.out.println(c1); return c1.equals("-"); };
            System.out.println(p5.test("-"));

            Predicate<Integer> p6 = c -> c > 0;
            System.out.println(p6.test(1));

            Predicate<Integer> p7 = c -> c <= 0;
            System.out.println(p7.test(1));

        } catch(Exception e){
            e.printStackTrace();

        }
    }
}
