package ocp.functional_interface.biconsumer;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class BiConsumerMain {

    public static void main(String args[]){

        Map<String, Integer> map = new HashMap<>();
        BiConsumer<String, Integer> b1 = map::put;
        BiConsumer<String, Integer> b2 = (k, v) -> map.put(k, v);

        b1.accept("key1", 1);
        b2.accept("key2", 2);

        System.out.println(map);

    }
}
