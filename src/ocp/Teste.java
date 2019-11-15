package ocp;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class TestA{

    private List a;

    public TestA(){
        a = new ArrayList();
    }

    public TestA(String str){
        System.out.println("" + str);
    }

    public List getA() {
        return a;
    }

    public void setA(List a) {
        this.a = a;
    }
}

public class Teste {

    public static void main(String args[]) throws ParseException {


    }
}
