package oca.comparator;

import java.util.Comparator;

public class ComparatorMain {

    public static void main(String args[]){
        Comparator<Integer> integer = Integer::compare;
        System.out.println(integer.compare(4, 2));
    }
}
