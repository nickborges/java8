package predicable;


interface Climb {
    public static final int LIMIT = 8;
    boolean isTooHigh(int height, int limit);
}

public class PredicableMain {

    private static void check(Climb climb, int height) {
         if (climb.isTooHigh(height, Climb.LIMIT)) {
             System.out.println("too high");

         } else {
             System.out.println("ok");
         }
    }

    public static void main(String args[]){
        check((h, l) -> h > l, 8);

    }
}
