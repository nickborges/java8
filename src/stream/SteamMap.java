package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SteamMap {

    public static void main(String args[]){

        List<ClassA> classAList = Arrays.asList(new ClassA("A", 20));
        List<ClassB> classBList = new ArrayList<>();

        classBList.addAll(classAList.stream().map(ClassB::new).collect(Collectors.toList()));


    }
}
