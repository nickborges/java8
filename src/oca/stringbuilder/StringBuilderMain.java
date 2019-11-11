package oca.stringbuilder;

public class StringBuilderMain {

    public static void main(String args[]){

        //creating a StringBuilder
        StringBuilder sb1 = new StringBuilder(); //containing an empty sequence of characters
        StringBuilder sb2 = new StringBuilder("animal"); //containing a specific value
        StringBuilder sb3 = new StringBuilder(5); //capacity: reserve a certain number of slots for characters

        //append(Object) : StringBuilder
        sb3.append("0");
        sb3.append("1");
        sb3.append("2");
        sb3.append("3");
        sb3.append("4");
        sb3.append("5");
        sb3.append("6");

        //insert(index, Object) : StringBuilder
        System.out.println(sb3.insert(2,"A")); //01A23456
        System.out.println(sb3.insert(8,'B')); //01A23456B
        System.out.println(sb3.insert(10,"C")); //StringIndexOutOfBoundsException

        //charAt(index) : char
        System.out.println(sb3.charAt(7)); //6
        System.out.println(sb3.charAt(8)); //StringIndexOutOfBoundsException

        //indexOf(String) : int or indexOf(String, index) : int
        System.out.println(sb3.indexOf("3")); //index 4
        System.out.println(sb3.indexOf("3", 3)); //index 4
        System.out.println(sb3.indexOf("3", 5)); //index -1

        //length() : int
        System.out.println(sb3.length()); //8

        //substring(int start) : String or substring(int start, int end) : String
        System.out.println(sb3.substring(2)); //A23456
        System.out.println(sb3.substring(2, 6)); //A234
        System.out.println(sb3.substring(10)); //StringIndexOutOfBoundsException
        System.out.println(sb3.substring(2, 10)); //StringIndexOutOfBoundsException

        //delete(start, end) : StringBuilder
        System.out.println(sb3.delete(2,4)); //013456
        System.out.println(sb3.delete(4,10)); //0134

        //deleteCharAt(int index) : StringBuilder
        System.out.println(sb3.deleteCharAt(3)); //013
        System.out.println(sb3.deleteCharAt(8)); //StringIndexOutOfBoundsException

        //toString() : String
        System.out.println(sb3); //013
        System.out.println(sb3.toString()); //013

    }
}
