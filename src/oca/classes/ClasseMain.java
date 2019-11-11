package oca.classes;

public class ClasseMain {

    static String value2 = "2";
    String value3 = "3";
    {
        value2 = "e";
        value3 = "f";
    }
    static {

        value2 = "h";
    }

    public static void main(String args[]){
        value2 = "e";

    }
}
