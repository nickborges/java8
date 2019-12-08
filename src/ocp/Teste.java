package ocp;


class Rodent {
}

public class Teste extends Rodent{

    public static void main(String args[]) {

        Rodent r = new Teste();
        Teste t = (Teste)r;

        if(r instanceof Teste)
            System.out.println(true);

        if(t instanceof Rodent)
            System.out.println(true);

    }
}
